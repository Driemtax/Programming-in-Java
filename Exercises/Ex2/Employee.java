public class Employee {
    private String name;
    private String jobTitle;
    private int salary;

    public Employee(String name, String jobTitle, int salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void RaiseSalaryByPercentage(int percantage){
        int newSalary = (this.salary * percantage) / 100;

        this.salary += newSalary;
        System.out.printf("The new salaray for %s is %d \n", this.name, this.salary);
    }

    public void Display(String[] attributes){
        for (String attribute : attributes) {
            switch (attribute) {
                case "name":
                    System.out.printf("Name of Employee: %s \n", this.name);
                    break;
                case "jobTitle":
                    System.out.printf("Job Title: %s \n", this.jobTitle);
                    break;
                case "salary":
                    System.out.printf("Salary: %d \n", this.salary);
                default:
                    break;
            }    
        }
    }
}
