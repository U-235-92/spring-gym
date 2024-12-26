package aq.gym.spring_abstractions.dependency_injection_way.repositories;

import aq.gym.spring_abstractions.dependency_injection_way.models.Comment;

public interface CommentRepository {

	void storeComment(Comment comment);
}
