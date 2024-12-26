package aq.gym.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class SecurityAspect {

	private Logger logger = Logger.getLogger(SecurityAspect.class.getName());
	
	@Around("@annotation(aq.gym.annotations.ToLog)")
	public void logDelete(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		logger.info("Security Aspect. Call the method " + methodName + " will execute");
		joinPoint.proceed();
		logger.info("Security Aspect. Method " + methodName + " executed");
	}
}
