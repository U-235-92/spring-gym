package aq.gym.spring_abstractions.dependency_injection_way.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

	private String author;
	private String text;
}
