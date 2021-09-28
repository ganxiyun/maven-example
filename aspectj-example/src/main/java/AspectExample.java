import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectExample {

    @Around("execution(* helloWorld(..))")
    public Object aspectMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Method executing");
        return joinPoint.proceed();
    }
}
