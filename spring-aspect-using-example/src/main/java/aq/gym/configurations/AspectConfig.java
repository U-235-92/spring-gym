package aq.gym.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aq.gym.aspects.LoggingAspect;
import aq.gym.aspects.SecurityAspect;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {

	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}
	
	@Bean
	public SecurityAspect securityAspect() {
		return new SecurityAspect();
	}
}
