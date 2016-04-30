package cyiq.spring.aop.exception;

public class MyExceptionProcess {
	/*
	 * 一个异常通知
	 */
	public void getExceptionMessage(Throwable e){
		System.err.println(e.getMessage());
	}
}
