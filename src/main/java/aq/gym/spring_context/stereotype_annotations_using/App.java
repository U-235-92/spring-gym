package aq.gym.spring_context.stereotype_annotations_using;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Using spring context.
 * Example of using stereotype annotation to add bean in context.
 */
public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot1 = context.getBean(Parrot.class);
        Parrot parrot2 = context.getBean(Parrot.class);
        System.out.println("Parrot: " + parrot1.getName());
        System.out.println("Is parrot1 equal parrot2? " + (parrot1 == parrot2));
    }
}
