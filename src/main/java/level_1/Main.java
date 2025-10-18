package level_1;

public class Main {
    @SuppressWarnings("deprecation")

    public static void main(String[] args) {
        FromHomeWorker fromHomeWorker1 = new FromHomeWorker("Terry", "Pratchet", 20.5);
        System.out.println("From-Home salary:" + fromHomeWorker1.salaryCalculation(36));
        PresentialWorker presentialWorker1 = new PresentialWorker("Emilio", "Bueso", 20.5, 60.3);
        System.out.println("In-Person salary:" + presentialWorker1.salaryCalculation(36));

        fromHomeWorker1.deprecatedOne();
        fromHomeWorker1.deprecatedTwo();
        fromHomeWorker1.deprecatedThree();
        presentialWorker1.deprecatedThings();
    }
}
