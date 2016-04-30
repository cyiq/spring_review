package cyiq.spring.alias;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cyiq.spring.utils.SpringHelper;

public class AliasTest extends SpringHelper{
	static{
		path="cyiq/spring/alias/applicationContext.xml";
	}
	@Test
	public void testSpring() {
		//此处的helloWorld为path指向的配置文件中的alias标签的alias属性
		HelloWorld helloworld = (HelloWorld) context.getBean("alias1");
		HelloWorld helloworld2 = (HelloWorld) context.getBean("alias2");
		helloworld.test();
		helloworld2.test();
	}
}
