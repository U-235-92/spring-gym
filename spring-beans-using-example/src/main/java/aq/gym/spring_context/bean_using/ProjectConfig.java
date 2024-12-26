package aq.gym.spring_context.bean_using;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

	@Primary
	@Bean(name = "koko")
	public Parrot parrot1() {
		Parrot koko = new Parrot();
		koko.setName("Koko");
		return koko;
	}
	
	@Bean(name = "miki")
	public Parrot parrot2() {
		Parrot miki = new Parrot();
		miki.setName("Miki");
		return miki;
	}
	
	@Bean(name = "riki")
	public Parrot parrot3() {
		Parrot riki = new Parrot();
		riki.setName("Riki");
		return riki;
	}
	
	@Bean
	public String hello() {
		return "Hello";
	}
	
	@Bean
	public Integer ten() {
		return Integer.valueOf(10);
	}
}
