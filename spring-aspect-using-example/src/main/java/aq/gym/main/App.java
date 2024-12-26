package aq.gym.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aq.gym.configurations.AspectConfig;
import aq.gym.configurations.ProjectConfig;
import aq.gym.models.Comment;
import aq.gym.services.CommentService;

/**
 * Aspect using example.
 */
public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class, AspectConfig.class);
        Comment comment = new Comment("Alice", "Drink me!");
        var commentService = context.getBean(CommentService.class);
        commentService.deleteComment(comment);
//        Call return type method using aspect
//        String value = commentService.publishComment(comment);
//        System.out.println(value);
    }
}
