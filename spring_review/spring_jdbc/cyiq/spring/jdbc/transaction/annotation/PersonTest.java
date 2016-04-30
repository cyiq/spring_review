package cyiq.spring.jdbc.transaction.annotation;

import org.junit.Test;	

import cyiq.spring.utils.SpringHelper;


public class PersonTest extends SpringHelper{
	static{
		path = "cyiq/spring/jdbc/transaction/annotation/applicationContext.xml";
	}
	
	@Test
	public void test(){
		PersonService personService = (PersonService)context.getBean("personService");
		personService.savePerson();
	}
}
