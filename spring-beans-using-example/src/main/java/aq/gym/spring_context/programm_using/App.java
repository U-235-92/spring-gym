package aq.gym.spring_context.programm_using;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Using spring context.
 * Example of programming adding beans in context.
 */
public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Supplier<Parrot> parrotSupplier = () -> {
        	Parrot parrot = new Parrot("Miki");
        	return parrot;
        };
        context.registerBean("my-bean-name", Parrot.class, parrotSupplier);
        Parrot parrotFromContext = context.getBean("my-bean-name", Parrot.class);
        System.out.println("Parrot: " + parrotFromContext.getName());
    }
}
