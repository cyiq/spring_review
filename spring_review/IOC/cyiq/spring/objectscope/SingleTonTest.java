package cyiq.spring.objectscope;

import org.junit.Test;

import cyiq.spring.utils.SpringHelper;

public class SingleTonTest extends SpringHelper{
	static{
		path = "cyiq/spring/objectscope/applicationContext.xml";
	}
	
	@Test
	public void testSingleTon(){
		HelloWorld helloWorld1 = (HelloWorld) context.getBean("helloWorld");
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld1);	//cyiq.spring.objectscope.HelloWorld@44cea16
		System.out.println(helloWorld2);	//cyiq.spring.objectscope.HelloWorld@44cea16
	}
}
