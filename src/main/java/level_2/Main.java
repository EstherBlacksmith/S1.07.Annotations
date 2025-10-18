package level_2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Coffee coffee01 = new Coffee("La cafetera", "Etiopia", true);

        Class<?> clazz = coffee01.getClass();

        if (!clazz.isAnnotationPresent(SerializeObjectIntoJson.class)) {
            throw new RuntimeException(clazz.getName() + " class hasn't the @JsonSerializable annotation");
        }

        SerializeObjectIntoJson annotation = clazz.getAnnotation(SerializeObjectIntoJson.class);

        System.out.println("The json file wiil be created at: " + annotation.pathDirectoryDestination() + File.separator + annotation.fileDestination());
        File directoryDestination = new File(annotation.pathDirectoryDestination());

        if (!directoryDestination.exists()) {
            try {
                directoryDestination.mkdirs();
            } catch (RuntimeException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        File fileDestination = new File(directoryDestination + File.separator + "javaObjectIntoJson.json");

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(fileDestination, coffee01);
            System.out.println("Json file created");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
