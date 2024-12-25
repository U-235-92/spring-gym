package aq.gym.spring_link_between_beans.linkage_by_autowired_annotation;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Parrot {
	
	private String name = "Mia";
}
