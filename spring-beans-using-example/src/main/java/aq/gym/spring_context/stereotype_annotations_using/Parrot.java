package aq.gym.spring_context.stereotype_annotations_using;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Parrot {
	
	private String name;
	
	@PostConstruct
	public void init() {
		this.name = "Mimi";
	}
}
