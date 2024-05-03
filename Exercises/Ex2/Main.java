public class Main {
    public static void main(String[] args) {
        Employee number1 = new Employee("Peter Kowalski", "Türsteher", 30000);
        Employee number2 = new Employee("Bob der Meister", "Bauarbeiter", 43000);

        number1.Display(new String[]{"name", "jobTitle", "salary"});
        number2.Display(new String[]{"name", "jobTitle", "salary"});

        number1.RaiseSalaryByPercentage(12);
        number1.Display(new String[]{"salary"});
    }
}
