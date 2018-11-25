package edu.ues.ECeL.models.test.clinica.cita;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.ues.ECeL.models.dao.clinica.cita.AgendaDao;
import edu.ues.ECeL.models.entity.clinica.cita.Agenda;

@RunWith(SpringJUnit4ClassRunner)
class AgendaDaoTest {
	
	final Logger logger = LoggerFactory.getLogger(AgendaDaoTest.class);

	@Autowired
	private AgendaDao agendaDao;
	
	public void imprimirListado(List<Agenda> agendas) {
		println("Listado");
		for(Agenda agenda: agendas) {
			println(agenda.toString())
		}
	}
	
	@Test
	void testSave() {
		fail("Not yet implemented");
	}

	@Test
	void testSaveOrUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByQuery() {
		List<Agenda> agendas = null;
		println("testFindByQuery");
		try {
			agenda = agendaDao.findByQuery("from Agenda codigo");
		}
	}

	@Test
	void testFindAll() {
		List<Agenda> agendas = agendaDao.findAll();
		println("testFindAll");
		assertNotNull("Las lista de Agendas es null", agendas);
		imprimirListado(agendas);
	}

	@Test
	void testFindById() {
		fail("Not yet implemented");
	}

}
