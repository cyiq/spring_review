package cyiq.spring.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class Transaction {
	/*
	 * 前置通知
	 */
	public void beginTransaction(){
		System.out.println("begin transaction");
	}
	/*
	 * 后置通知
	 */
	public void commit(){
		System.out.println("commit");
	}
	/*
	 * 最终通知
	 */
	public void finallyMethod(){
		System.out.println("finally");
	}
	/*
	 * 异常通知
	 */
	public void exceptionMethod(Throwable e){
		System.out.println(e.getMessage());
	}
	/*
	 * 环绕通知（能控制目标方法的执行）
	 */
	public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("before target");
		String methodName = joinPoint.getSignature().getName();
		if("deletePerson".equals(methodName)){
			joinPoint.proceed();
		}
		System.out.println("after target");
	}
}
