package aq.gym.aspects;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class LoggingAspect {

	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	@Around("execution(* aq.gym.services.CommentService.publishComment(aq.gym.models.Comment))")
	public Object logPublish(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		logger.info("Method " + methodName + " with parameters " + Arrays.asList(args) + " will execute");
		Object returnedByMethod = joinPoint.proceed();
		logger.info("Method executed and returned " + returnedByMethod);
		return returnedByMethod + " TRICK JUST FOR FUN (:";
	}
	
	@Around("@annotation(aq.gym.annotations.ToLog)")
	public void logDelete(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		logger.info("Logging Aspect. Call the method " + methodName + " will execute");
		joinPoint.proceed();
		logger.info("Logging Aspect. Method " + methodName + " executed");
	}
}
