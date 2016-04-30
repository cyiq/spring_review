package cyiq.spring.proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class PersonDaoTest {
	@Test
	public void testTransaction(){
		Transaction transaction = new Transaction();
		PersonDao target = new PersonDaoImpl();
		PersonDaoInterceptor interceptor = new PersonDaoInterceptor(transaction, target);
		PersonDao proxy = (PersonDao) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),interceptor);
//		proxy.deletePerson();		//transaction start;
		System.out.println(proxy.getPerson().size()); // no transaction
		
	}
}
