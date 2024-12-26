package aq.gym.spring_abstractions.dependency_injection_way.proxies;

import org.springframework.stereotype.Component;
import aq.gym.spring_abstractions.dependency_injection_way.models.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending notification for comment: " + comment.getText());
	}
}
