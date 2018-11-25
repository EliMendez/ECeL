package edu.ues.ECeL.models.test.clinica.cita;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.models.dao.clinica.cita.AgendaDao;
import edu.ues.ECeL.models.entity.clinica.cita.Agenda;

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
		fail("Not yet implemented");
	}

	@Test
	void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	void testFindById() {
		fail("Not yet implemented");
	}

}
