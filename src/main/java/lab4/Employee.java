package lab4;

/**
 * Created by Evegeny on 19/05/2016.
 */
public class Employee {
    private Company company;
    private int salary;

    public Employee(Company company, int salary) {
        this.company = company;
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }
}
