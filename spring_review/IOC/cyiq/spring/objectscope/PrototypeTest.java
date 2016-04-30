package cyiq.spring.objectscope;

import org.junit.Test;

import cyiq.spring.utils.SpringHelper;

public class PrototypeTest extends SpringHelper{
	static{
		path = "cyiq/spring/objectscope/applicationContext2.xml";
	}
	
	@Test
	public void testPrototype(){
		System.out.println("after getBean");	//执行到此句时没有对象被实例化。
		HelloWorld helloWorld1 = (HelloWorld) context.getBean("helloWorld");
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld1);	//cyiq.spring.objectscope.HelloWorld@68f4055f
		System.out.println(helloWorld2);	//cyiq.spring.objectscope.HelloWorld@6c8cd5cd
	}
}
