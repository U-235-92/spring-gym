package aq.gym.spring_abstractions.proxies;

import aq.gym.spring_abstractions.models.Comment;

public interface CommentNotificationProxy {

	void sendComment(Comment comment);
}
