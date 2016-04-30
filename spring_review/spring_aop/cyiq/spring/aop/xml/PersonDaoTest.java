package cyiq.spring.aop.xml;

import org.junit.Test;

import cyiq.spring.utils.SpringHelper;

public class PersonDaoTest extends SpringHelper{
	static{
		path = "cyiq/spring/aop/xml/applicationContext.xml";
	}
	
	@Test
	public void testAOP(){
		PersonDao personDao = (PersonDao) context.getBean("personDao");
		personDao.deletePerson();
	}
}
