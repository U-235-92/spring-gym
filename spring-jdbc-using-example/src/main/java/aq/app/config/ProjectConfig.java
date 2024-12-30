package aq.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import aq.app.repositories.PersonRepository;
import aq.app.services.PersonService;

@Configuration
@ComponentScan(basePackageClasses = { PersonService.class, PersonRepository.class})
public class ProjectConfig {}
