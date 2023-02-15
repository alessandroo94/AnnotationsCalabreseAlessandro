package Annotations02;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DevAnnotation {
    String DevName();
    String DevSurname();
}
