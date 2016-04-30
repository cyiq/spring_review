package cyiq.spring.aop.exception.service;

import java.util.List;

import cyiq.spring.aop.exception.dao.Person;
import cyiq.spring.aop.exception.dao.PersonDao;

public class PersonServiceImpl implements PersonService{
	private PersonDao personDao;
	

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void savePerson() throws Exception {
		personDao.savePerson();
	}

	@Override
	public void updatePerson() throws Exception {
		personDao.updatePerson();
	}

	@Override
	public void deletePerson() throws Exception {
		personDao.deletePerson();
	}

	@Override
	public List<Person> getPerson() throws Exception {
		personDao.getPerson();
		return null;
	}
	
}
