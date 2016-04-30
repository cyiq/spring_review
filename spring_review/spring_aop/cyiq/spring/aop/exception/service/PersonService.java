package cyiq.spring.aop.exception.service;

import java.util.List;

import cyiq.spring.aop.exception.dao.Person;

public interface PersonService {
	public void savePerson() throws Exception;
	public void updatePerson() throws Exception;
	public void deletePerson() throws Exception;
	public List<Person> getPerson() throws Exception;
}
