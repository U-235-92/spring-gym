package aq.gym.spring_abstractions.repositories;

import org.springframework.stereotype.Repository;

import aq.gym.spring_abstractions.models.Comment;

@Repository
public class DbCommentRepository implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		System.out.println("Stroring comment: " + comment.getText());
	}

}
