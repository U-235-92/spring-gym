package aq.app.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aq.app.config.DataSourceConfig;
import aq.app.config.ProjectConfig;
import aq.app.models.Person;
import aq.app.services.PersonService;

/**
 * Spring JDBC example
 */
public class App {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		var context = new AnnotationConfigApplicationContext(DataSourceConfig.class, ProjectConfig.class);
        var personService = context.getBean(PersonService.class);
        Person bob = new Person("Bob", 30);
        Person alice = new Person("Alice", 22);
        savePerson(personService, alice, bob);
        List<Person> persons = getPersons(personService);
        printPersons(persons);
        
    }
    
    private static void savePerson(PersonService personService, Person person, Person...persons) {
    	personService.savePerson(person);
    	if(persons.length > 0)
    		personService.savePersons(persons);
    }
    
    private static List<Person> getPersons(PersonService personService) {
    	return personService.getPersons();
    }
    
    private static void printPersons(List<Person> persons) {
    	System.out.println("Persons:");
    	persons.stream().forEach(System.out::println);
    }
}
