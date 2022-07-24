package sample;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String path();
}
