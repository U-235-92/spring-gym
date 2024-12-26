package aq.gym.spring_abstractions.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"aq.gym.spring_abstractions.proxies",
					"aq.gym.spring_abstractions.services",
					"aq.gym.spring_abstractions.repositories"})
public class ProjectConfiguration {}
