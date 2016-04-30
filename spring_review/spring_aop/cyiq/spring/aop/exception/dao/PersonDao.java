package cyiq.spring.aop.exception.dao;

import java.util.List;

public interface PersonDao {
	public void savePerson() throws Exception;
	public void updatePerson() throws Exception;
	public void deletePerson() throws Exception;
	public List<Person> getPerson() throws Exception;
}
