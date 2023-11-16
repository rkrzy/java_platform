package Weekend_6.Myvalidator0507;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {
    public String message();
}
