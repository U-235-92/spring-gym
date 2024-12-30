package aq.app.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aq.app.config.DataSourceConfig;
import aq.app.config.ProjectConfig;
import aq.app.services.PersonService;

/**
 * Spring JDBC example
 */
public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(DataSourceConfig.class, ProjectConfig.class);
        var service = context.getBean(PersonService.class);
        System.out.println(service);
    }
}
