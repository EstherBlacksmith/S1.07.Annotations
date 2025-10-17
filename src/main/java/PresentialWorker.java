public class PresentialWorker extends Worker{
    protected static Double gas;

    public PresentialWorker(String name, String secondName, Double pricePerHour, Double gas) {
        super(name, secondName, pricePerHour);
        if (gas < 0 ) {
            throw new IllegalArgumentException("It's impossible to pay negative gas: " + gas);
        }
        this.gas = gas;
    }


    public static void setGas(Double gas) {
        if (gas < 0 ) {
            throw new IllegalArgumentException("It's impossible to pay negative gas: " + gas);
        }
        PresentialWorker.gas = gas;
    }

    @Override
    protected Double salaryCalculation(float hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("It's impossible to work negatives hours");
        }

        Double totalSalary = 0.0;

        totalSalary = (pricePerHour * hours) + gas;

        return totalSalary;
    }
}
