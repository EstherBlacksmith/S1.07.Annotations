public class FromHomeWorker extends Worker {
    final Double INTERNET_PRICE = 65.90;

    public FromHomeWorker(String name, String secondName, Double pricePerHour) {
        super(name, secondName, pricePerHour);

    }

    @Override
    protected Double salaryCalculation(float hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("It's impossible to work negatives hours");
        }

        Double totalSalary = 0.0;

        totalSalary = (pricePerHour * hours) + INTERNET_PRICE;

        return totalSalary;
    }
}
