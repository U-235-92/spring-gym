package aq.gym.spring_abstractions.dependency_injection_way.services;

import org.springframework.stereotype.Component;

import aq.gym.spring_abstractions.dependency_injection_way.models.Comment;
import aq.gym.spring_abstractions.dependency_injection_way.proxies.CommentNotificationProxy;
import aq.gym.spring_abstractions.dependency_injection_way.repositories.CommentRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CommentService {

	private CommentRepository commentRepository;
	private CommentNotificationProxy commentNotificationProxy;
	
	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
}
