package aq.gym.spring_link_between_beans.linkage_by_autowired_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Person ella = context.getBean(Person.class);
		Parrot koko = context.getBean(Parrot.class);
		System.out.println(ella);
		System.out.println(koko);
	}
}
