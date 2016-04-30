package cyiq.spring.di.xml.constructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private Long pid;
	private String pname;
	private Student student;
	
	public Person(Long pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	
	public Person(String pname, Student student) {
		super();
		this.pname = pname;
		this.student = student;
	}
	
	public Person(Long pid, String pname, Student student) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.student = student;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", student="
				+ student + "]";
	}
	
	
	
	
}
