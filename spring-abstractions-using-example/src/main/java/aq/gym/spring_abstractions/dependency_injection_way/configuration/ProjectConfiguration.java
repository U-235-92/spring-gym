package aq.gym.spring_abstractions.dependency_injection_way.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"aq.gym.spring_abstractions.dependency_injection_way.proxies",
					"aq.gym.spring_abstractions.dependency_injection_way.services",
					"aq.gym.spring_abstractions.dependency_injection_way.repositories"})
public class ProjectConfiguration {}
