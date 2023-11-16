package HW4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Size {
    int min() default 0;
    int max() default 0;
    String message() default "";
}
