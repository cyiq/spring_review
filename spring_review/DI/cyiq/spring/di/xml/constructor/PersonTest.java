package cyiq.spring.di.xml.constructor;

import org.junit.Test;	

import cyiq.spring.utils.SpringHelper;

public class PersonTest extends SpringHelper{
	static{
		path="cyiq/spring/di/xml/constructor/applicationContext.xml";
	}
	
	@Test
	public void testDIPerson(){
		//根据参数类型确定调用哪个构造函数创建person对象。
		Person person = (Person) context.getBean("person");
		System.out.println(person);
	}
	
}
