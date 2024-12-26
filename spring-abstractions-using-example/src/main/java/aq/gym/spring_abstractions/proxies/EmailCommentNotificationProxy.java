package aq.gym.spring_abstractions.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import aq.gym.spring_abstractions.models.Comment;

@Component
//@Primary //It helps to resolve a problem connected with using one bean from some number ones
@Qualifier("EMAIL") //It's alternative way to explain spring which bean we are going to use
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending email notification for comment: " + comment.getText());
	}
}
