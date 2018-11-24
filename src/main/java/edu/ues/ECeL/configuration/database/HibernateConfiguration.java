package edu.ues.ECeL.configuration.database;

import java.util.Properties;

import javax.sql.DataSource;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="edu.ues.ECeL")
@PropertySource("classpath:application.properties")
public class HibernateConfiguration {
    
	@Autowired
    private Environment environment;
    
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
    }
    
    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setPackagesToScan(new String[] {"edu.ues.ECeL"});
        sessionFactoryBean.setHibernateProperties(hibernateProperties());
        return sessionFactoryBean;
    }
    
    private Properties hibernateProperties(){
        Properties properties = new Properties();
        properties.put(AvailableSettings.DIALECT,environment.getRequiredProperty("hibernate.dialect"));
        properties.put(AvailableSettings.SHOW_SQL,environment.getRequiredProperty("hibernate.show_sql"));
        properties.put(AvailableSettings.HBM2DDL_AUTO,environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
        properties.put(AvailableSettings.FORMAT_SQL,environment.getRequiredProperty("hibernate.format_sql"));
        properties.put(AvailableSettings.CURRENT_SESSION_CONTEXT_CLASS,environment.getRequiredProperty("hibernate.current.session.context.class"));
        properties.put(AvailableSettings.HBM2DDL_CHARSET_NAME,environment.getRequiredProperty("hibernate.charset"));
        return properties;
    }
    
    @Bean
    public HibernateTransactionManager transactionManager(){
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }

}
