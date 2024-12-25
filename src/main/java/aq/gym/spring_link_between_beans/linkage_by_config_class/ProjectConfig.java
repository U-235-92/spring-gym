package aq.gym.spring_link_between_beans.linkage_by_config_class;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
	
	/**Wiring beans by direct call of the bean-method */
//	@Bean(name = "ella")
//	public Person person() {
//		Person ella = new Person();
//		ella.setName("Ella");
//		ella.setParrot(parrot());
//		return ella;
//	}
	
	/**Wiring beans by sending a bean as a method parameter*/
//	@Bean(name = "ella")
//	public Person person(Parrot parrot) {
//		Person ella = new Person();
//		ella.setName("Ella");
//		ella.setParrot(parrot);
//		return ella;
//	}
	
	@Bean(value = "koko")
	public Parrot koko() {
		Parrot koko = new Parrot();
		koko.setName("Koko");
		return koko;
	}
	
	@Bean(value = "miki")
	public Parrot miki() {
		Parrot koko = new Parrot();
		koko.setName("Koko");
		return koko;
	}
	
//	Example of binding bean by using @Qualifier (It uses if we have some number of the same types of beans in the context)
	@Bean(name = "ella")
	public Person person(@Qualifier("koko") Parrot parrot) {
		Person ella = new Person();
		ella.setName("Ella");
		ella.setParrot(parrot);
		return ella;
	}
}
