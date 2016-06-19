package lab5;

import java.util.List;

/**
 * Created by Evegeny on 19/05/2016.
 */
public class Company {
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
