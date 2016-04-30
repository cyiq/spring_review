package cyiq.spring.di.annotation;

import javax.annotation.Resource;

public class Person {
	@Resource(name="student")
	public Student student;
	
	public Long pid;
}
