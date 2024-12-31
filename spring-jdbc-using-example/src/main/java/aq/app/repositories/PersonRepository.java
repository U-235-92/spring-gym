package aq.app.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import aq.app.models.Person;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class PersonRepository {

	private final JdbcTemplate jdbcTemplate;
	
	public void savePerson(Person person) {
		String sql = "INSERT INTO persons (name, age) VALUES (?, ?)";
		jdbcTemplate.update(sql, person.getName(), person.getAge());
	}
	
	public void savePersons(Person...persons) {
		String sql = "INSERT INTO persons (name, age) VALUES (?, ?)";
		List<Object[]> args = Arrays
				.stream(persons)
				.map(person -> new Object[] {person.getName(), person.getAge()})
				.toList();
		jdbcTemplate.batchUpdate(sql, args);
	}
	
	public List<Person> getPersons() {
		String sql = "SELECT * FROM persons";
		RowMapper<Person> personRowMapper = (rs, rowNum) -> {
			String name = rs.getString("name");
			int age = rs.getInt("age");
			int id = rs.getInt("id");
			Person person = new Person(name, age);
			person.setId(id);
			return person;
		}; 
		return jdbcTemplate.query(sql, personRowMapper);
	}
}
