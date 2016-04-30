package cyiq.spring.aop.xml;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

	@Override
	public void savePerson() {
		System.out.println("save Person");
	}

	@Override
	public void updatePerson() {
		System.out.println("update Person");
	}

	@Override
	public void deletePerson() {
		int i = 1/0;
		System.out.println("delete Person");
	}

	@Override
	public List<Person> getPerson() {
		Person person1 = new Person();
		person1.setPid(1L);
		person1.setPname("1111111");
		Person person2 = new Person();
		person2.setPid(2L);
		person2.setPname("2222222");
		List<Person> personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		return personList;
	}

}
