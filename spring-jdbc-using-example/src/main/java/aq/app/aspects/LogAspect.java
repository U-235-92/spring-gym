package aq.app.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	private static final Logger LOGGER = Logger.getLogger(LogAspect.class.getName());
	
	@Around("execution(* aq.app.services.PersonService.*(..))")
	public Object logMethodCall(ProceedingJoinPoint joinPoint) throws Throwable {
		String method = joinPoint.getSignature().getName();
		LOGGER.info("Call the method: " + method);
		return joinPoint.proceed();
	}
}
