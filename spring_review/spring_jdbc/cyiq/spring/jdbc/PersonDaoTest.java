package cyiq.spring.jdbc;

import org.junit.Test;

import cyiq.spring.utils.SpringHelper;

public class PersonDaoTest extends SpringHelper{
	static{
		path="cyiq/spring/jdbc/applicationContext.xml";
	}
	@Test
	public void testSave() throws Exception{
		PersonDao personDao = (PersonDao) context.getBean("personDao");
		personDao.savePerson();
	}
}
