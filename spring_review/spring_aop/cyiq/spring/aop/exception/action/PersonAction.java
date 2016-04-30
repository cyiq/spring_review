package cyiq.spring.aop.exception.action;

import java.util.List;

import cyiq.spring.aop.exception.dao.Person;
import cyiq.spring.aop.exception.service.PersonService;

public class PersonAction {
	private PersonService personService;
	
	
	public PersonService getPersonService() {
		return personService;
	}
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	public void savePerson() throws Exception {
		personService.savePerson();
	}

	public void updatePerson() throws Exception {
		personService.updatePerson();
	}

	public void deletePerson() throws Exception {
		personService.deletePerson();
	}

	public List<Person> getPerson() throws Exception {
		personService.getPerson();
		return null;
	}
}
