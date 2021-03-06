package cl.injcristianrojas.spring.data.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.injcristianrojas.spring.data.dao.PersonDAO;
import cl.injcristianrojas.spring.data.model.Person;
import cl.injcristianrojas.spring.data.service.PersonService;

@Service("PersonService")
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDAO personDAO;

	@Override
	public void createPerson(Person person) {
		personDAO.insertPerson(person);
	}

	@Override
	public List<Person> getAllPersons() {
		return personDAO.getAllPersons();
	}

	@Override
	public List<Person> getPersonsOfType(String type) {
		return personDAO.getPersonsOfType(type);
	}

}
