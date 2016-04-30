package cyiq.spring.di.scan;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Person {
	@Resource(name="student")
	public Student student;
	
	public Long pid;
}
