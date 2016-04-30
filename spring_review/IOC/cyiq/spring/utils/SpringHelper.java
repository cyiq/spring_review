package cyiq.spring.utils;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelper {
	public static String path = "";
	public static ApplicationContext context;
	@Before
	public void startSpring(){
		context = new ClassPathXmlApplicationContext(path);
	}
}
