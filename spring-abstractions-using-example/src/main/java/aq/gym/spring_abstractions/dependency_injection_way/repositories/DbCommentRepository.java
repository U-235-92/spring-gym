package aq.gym.spring_abstractions.dependency_injection_way.repositories;

import org.springframework.stereotype.Component;

import aq.gym.spring_abstractions.dependency_injection_way.models.Comment;

@Component
public class DbCommentRepository implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		System.out.println("Stroring comment: " + comment.getText());
	}

}
