package aq.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import aq.app.models.Person;
import aq.app.repositories.PersonRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {

	private final PersonRepository personRepository;
	
	public void savePerson(Person person) {
		personRepository.savePerson(person);
	}
	
	public void savePersons(Person...persons) {
		personRepository.savePersons(persons);
	}
	
	public List<Person> getPersons() {
		return personRepository.getPersons(); 
	}
}
