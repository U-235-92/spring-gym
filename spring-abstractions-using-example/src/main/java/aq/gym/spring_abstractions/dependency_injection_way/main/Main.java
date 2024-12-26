package aq.gym.spring_abstractions.dependency_injection_way.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aq.gym.spring_abstractions.dependency_injection_way.configuration.ProjectConfiguration;
import aq.gym.spring_abstractions.dependency_injection_way.services.CommentService;
import aq.gym.spring_abstractions.dependency_injection_way.models.Comment;

public class Main {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		var comment = new Comment("Bob", "Demo comment");
		var commentService = context.getBean(CommentService.class);
		commentService.publishComment(comment);
	}

}
