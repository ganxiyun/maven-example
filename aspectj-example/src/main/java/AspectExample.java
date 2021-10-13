import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectExample {
    @Around("execution(public * helloWorld(..))")
    public Object weaveExample(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AspectExample aspect is executing");
        return joinPoint.proceed();
    }
}
