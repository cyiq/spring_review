package cyiq.spring.jdbc.transaction;

import org.junit.Test;	

import cyiq.spring.utils.SpringHelper;


public class PersonTest extends SpringHelper{
	static{
		path = "cyiq/spring/jdbc/transaction/applicationContext.xml";
	}

	@Test
	public void test(){
		PersonService personService = (PersonService)context.getBean("personService");
		System.out.println(personService);
		personService.savePerson();
	}
}

