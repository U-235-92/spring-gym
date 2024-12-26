package aq.gym.spring_abstractions.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aq.gym.spring_abstractions.models.Comment;
import aq.gym.spring_abstractions.services.CommentService;
import aq.gym.spring_abstractions.configuration.ProjectConfiguration;

public class Main {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		var comment = new Comment("Bob", "Demo comment");
		var commentService = context.getBean(CommentService.class);
		commentService.publishComment(comment);
	}

}
