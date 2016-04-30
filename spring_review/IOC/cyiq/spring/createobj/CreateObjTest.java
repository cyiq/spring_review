package cyiq.spring.createobj;

import org.junit.Test;

import cyiq.spring.utils.SpringHelper;

public class CreateObjTest extends SpringHelper {
	static{
		path = "cyiq/spring/createobj/applicationContext.xml";
	}
	@Test
	public void testCreate(){
		System.out.println("before getBean");	//执行到此句时helloWorld对象已通过静态工程方法实例化
		context.getBean("helloWorld");		//如果在bean中设置lazy-init="true" 则此句调用bean时才实例化
	}
}
