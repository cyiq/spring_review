package cyiq.spring.jdbc;

import org.junit.Test;

import cyiq.spring.utils.SpringHelper;

public class PersonDaoTest2 extends SpringHelper{
	static{
		path="cyiq/spring/jdbc/applicationContext.xml";
	}
	@Test
	public void testSave() throws Exception{
		PersonDao personDao = (PersonDao) context.getBean("personDao2");
		personDao.savePerson();
	}
}
