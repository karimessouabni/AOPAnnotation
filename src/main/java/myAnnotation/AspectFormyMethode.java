package myAnnotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;



/**
 * The Class that will encapsulate our Cross-cutting concern => the methode that will calculate the loging time
 */
@Aspect
@Component
public class AspectFormyMethode {


    //Apply this advice any method which is annotated
    @Around("@annotation(ExecutionTime)")
    public Object adviceCalculation(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;

        System.out.println(joinPoint.getSignature() + " AOP Time execution calculation : " + executionTime + "ms");
        return proceed;

    }
}
