package aq.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aq.app.aspects.LogAspect;
import aq.app.repositories.PersonRepository;
import aq.app.services.PersonService;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = { PersonService.class, PersonRepository.class, LogAspect.class})
public class ProjectConfig {}
