package level_2;

import java.util.Objects;

@SerializeObjectIntoJson(pathDirectoryDestination = "C:\\ItAcademy2025\\SpringBoot", fileDestination = "javaObjectIntoJson.json")
public class Coffee {
    protected String name;
    protected String origin;
    protected boolean caffeinate;

    public Coffee(String name, String origin, boolean caffeinate) {
        this.name = Objects.requireNonNull(name);
        this.origin = Objects.requireNonNull(origin);
        this.caffeinate = caffeinate;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public boolean isCaffeinate() {
        return caffeinate;
    }
}
