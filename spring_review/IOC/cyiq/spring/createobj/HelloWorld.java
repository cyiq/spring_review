package cyiq.spring.createobj;

public class HelloWorld {
	public HelloWorld(String str){
		System.out.println(str);
	}
	
	public static HelloWorld getHelloWorld(){
		return new HelloWorld("6666666666666");
	}
	
	public void test(){
		System.out.println("Hello world!!!");
	}
}
