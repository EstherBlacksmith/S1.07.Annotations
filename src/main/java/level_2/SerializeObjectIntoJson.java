package level_2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SerializeObjectIntoJson {
    String pathDirectoryDestination();

    String fileDestination();
}
