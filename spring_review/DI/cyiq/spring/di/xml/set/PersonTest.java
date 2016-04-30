package cyiq.spring.di.xml.set;

import org.junit.Test;

import cyiq.spring.utils.SpringHelper;

public class PersonTest extends SpringHelper{
	static{
		path="cyiq/spring/di/xml/set/applicationContext.xml";
	}
	
	@Test
	public void testDIPerson(){
		Person person = (Person) context.getBean("person");
		System.out.println(person.getPid());
		System.out.println(person.getPname());
		System.out.println(person.getList().size());
		System.out.println(person.getSet().size());
		System.out.println(person.getMap().size());
	}
	
}
