package cyiq.spring.aop.exception.dao;

import java.util.List;

public class PersonDaoImpl implements PersonDao{

	@Override
	public void savePerson() throws Exception {
		System.out.println("savePerson");
		int i = 1/0;
	}

	@Override
	public void updatePerson() throws Exception {
		System.out.println("updatePerson");
		int i = 1/0;
	}

	@Override
	public void deletePerson() throws Exception {
		System.out.println("deletePerson");
		int i = 1/0;
	}

	@Override
	public List<Person> getPerson() throws Exception {
		System.out.println("getPerson");
		int i = 1/0;
		return null;
	}
	
}
