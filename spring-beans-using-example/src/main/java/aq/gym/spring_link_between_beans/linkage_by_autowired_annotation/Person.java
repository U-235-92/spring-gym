package aq.gym.spring_link_between_beans.linkage_by_autowired_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Person {

	private String name = "Ella";
//	@Autowired //Example of wiring a bean 'parrot' from context by the field-wiring
	private final Parrot parrot;
	
//	Example of using the @Autowired annotation to bind a bean 'parrot' with argument of the constructor
	public Person(@Autowired Parrot parrot) {
		this.parrot = parrot;
	}
	
//	Example of using a setter to bind a bean with the setter
//	@Autowired
//	public void setParrot(Parrot parrot) {
//		this.parrot = parrot;
//	}
}
