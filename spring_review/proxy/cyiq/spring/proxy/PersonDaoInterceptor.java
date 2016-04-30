package cyiq.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonDaoInterceptor implements InvocationHandler {
	
	private Transaction transaction;
	private Object target;
	
	public PersonDaoInterceptor(Transaction transaction,Object target){
		this.transaction = transaction;
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object returnVal;
		String methodName = method.getName();
		if("savePerson".equals(methodName) ||
			"updatePerson".equals(methodName) ||
			"deletePerson".equals(methodName) 
				){
			this.transaction.beginTransaction();
			returnVal = method.invoke(this.target, args);
			this.transaction.commit();
		}else{
			returnVal = method.invoke(this.target,args);
		}
		return returnVal;
	}

}
