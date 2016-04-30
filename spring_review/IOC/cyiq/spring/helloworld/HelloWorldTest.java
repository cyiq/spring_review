package cyiq.spring.helloworld;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
	@Test
	public void testSpring(){
		System.out.println("breakpoint");		//此处设置断点
		//程序运行完下一行后将会初始化HelloWorld类  控制台打印 HelloWorld Constractor.
		ApplicationContext context = new ClassPathXmlApplicationContext("cyiq/spring/helloworld/applicationContext.xml");
		//此处的helloWorld为上行指向的配置文件中的bean的id
		HelloWorld helloworld = (HelloWorld) context.getBean("helloWorld");
		helloworld.test();
	}
}
