package level_1;

import java.util.Objects;

public class Worker {
    protected String name;
    protected String secondName;
    protected Double pricePerHour;

    public Worker(String name, String secondName, Double pricePerHour) {
        this.name = Objects.requireNonNull(name, "Name must have value");
        this.secondName = Objects.requireNonNull(secondName, "Second name must have value");
        if (pricePerHour < 1) {
            throw new IllegalArgumentException("You cannot pay less than 1 per hour: " + pricePerHour);
        }
        this.pricePerHour = pricePerHour;
    }

    protected Double salaryCalculation(float hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("It's impossible to work negatives hours");
        }

        Double totalSalary = 0.0;

        totalSalary = pricePerHour * hours;
        return totalSalary;
    }
}
