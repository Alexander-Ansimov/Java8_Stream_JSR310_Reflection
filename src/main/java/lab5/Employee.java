package lab5;

/**
 * Created by Evegeny on 19/05/2016.
 */
public class Employee {
    private Seniority seniority;

    public Employee(Seniority seniority) {
        this.seniority = seniority;
    }

    public Seniority getSeniority() {
        return seniority;
    }
}
