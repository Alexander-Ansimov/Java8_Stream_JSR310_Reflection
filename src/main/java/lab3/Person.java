package lab3;

/**
 * Created by Evegeny on 18/05/2016.
 */
public class Person {
    private Gender gender;
    private int income;

    public Person(Gender gender, int income) {
        this.gender = gender;
        this.income = income;
    }

    public Gender getGender() {
        return gender;
    }

    public int getIncome() {
        return income;
    }
}
