package lab2;

/**
 * Created by Evegeny on 18/05/2016.
 */
public class Employee {
    private String name;
    private Company company;
    private Insurance insurance;
    private String salary;

    public Employee(String salary) {
        this.salary = salary;
    }

    public Employee(String name, Company company, Insurance insurance) {
        this.name = name;
        this.company = company;
        this.insurance = insurance;
    }

    public String getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public Insurance getInsurance() {
        return insurance;
    }
}














