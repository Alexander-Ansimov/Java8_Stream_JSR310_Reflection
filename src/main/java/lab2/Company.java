package lab2;

/**
 * Created by Evegeny on 18/05/2016.
 */
public class Company {
    private String name;
    private int income;

    private int[] expenses;

    public Company(int[] expenses) {
        this.expenses = expenses;
    }

    public Company(String name, int income) {
        this.name = name;
        this.income = income;
    }

    public Company(int income) {
        this.income = income;
    }

    public int[] getExpenses() {
        return expenses;
    }

    public String getName() {
        return name;
    }

    public int getIncome() {
        return income;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", income=" + income +
                '}';
    }
}
