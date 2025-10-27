public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to increase salary by a percentage
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }

    // Method to decrease salary by a percentage
    public void decreaseSalary(double percentage) {
        if (percentage > 0) {
            salary -= salary * (percentage / 100);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Employee emp = new Employee("Sarge Baat", "Cars seller", 150);

        System.out.println("Name: " + emp.getName());
        System.out.println("Job Title: " + emp.getJobTitle());
        System.out.println("Salary: $" + emp.getSalary());

        emp.increaseSalary(10); // Increase salary by 10%
        System.out.println("Salary after 10% increase: $" + emp.getSalary());

        emp.decreaseSalary(5); // Decrease salary by 5%
        System.out.println("Salary after 5% decrease: $" + emp.getSalary());
    }
}