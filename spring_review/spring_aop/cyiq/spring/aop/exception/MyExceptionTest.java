package cyiq.spring.aop.exception;

import org.junit.Test;

import cyiq.spring.aop.exception.action.PersonAction;
import cyiq.spring.utils.SpringHelper;

public class MyExceptionTest extends SpringHelper{
	static{
		path="cyiq/spring/aop/exception/applicationContext.xml";
	}
	@Test
	public void testExceptionProcess() throws Exception{
		PersonAction action = (PersonAction) context.getBean("personAction");
		action.deletePerson();
	}
	
}
