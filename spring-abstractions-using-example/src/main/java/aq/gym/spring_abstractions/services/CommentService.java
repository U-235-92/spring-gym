package aq.gym.spring_abstractions.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import aq.gym.spring_abstractions.models.Comment;
import aq.gym.spring_abstractions.proxies.CommentNotificationProxy;
import aq.gym.spring_abstractions.repositories.CommentRepository;

@Service
public class CommentService {

	private CommentRepository commentRepository;
	private CommentNotificationProxy commentNotificationProxy;
	
	@Autowired
	public CommentService(CommentRepository commentRepository, 
			@Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
		super();
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}

	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
}
