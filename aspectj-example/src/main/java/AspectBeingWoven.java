import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectBeingWoven {

    @Around("execution(* helloWorld(..))")
    public Object beingWoven(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AspectBeingWoven aspect is executing");
        return joinPoint.proceed();
    }
}
