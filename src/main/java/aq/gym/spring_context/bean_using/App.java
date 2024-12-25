package aq.gym.spring_context.bean_using;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Using spring context.
 * Example of adding beans in context by @Bean annotation.
 */
public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean("miki", Parrot.class);
        String hello = context.getBean(String.class);
        Integer ten = context.getBean(Integer.class);
        System.out.println("Parrot: " + parrot.getName());
        System.out.println("String: " + hello);
        System.out.println("Integer: " + ten);
    }
}
