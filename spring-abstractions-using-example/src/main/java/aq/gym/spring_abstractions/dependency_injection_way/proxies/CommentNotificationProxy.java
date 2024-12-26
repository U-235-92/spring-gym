package aq.gym.spring_abstractions.dependency_injection_way.proxies;

import aq.gym.spring_abstractions.dependency_injection_way.models.Comment;

public interface CommentNotificationProxy {

	void sendComment(Comment comment);
}
