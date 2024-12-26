package aq.gym.spring_abstractions.repositories;

import aq.gym.spring_abstractions.models.Comment;

public interface CommentRepository {

	void storeComment(Comment comment);
}
