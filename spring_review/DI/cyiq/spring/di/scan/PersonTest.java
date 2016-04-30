package cyiq.spring.di.scan;

import org.junit.Test;	

import cyiq.spring.utils.SpringHelper;

public class PersonTest extends SpringHelper{
	static{
		path="cyiq/spring/di/scan/applicationContext.xml";
	}
	@Test
	public void testAnnotation(){
		Person person = (Person) context.getBean("person");
		person.student.show();
	}
}
