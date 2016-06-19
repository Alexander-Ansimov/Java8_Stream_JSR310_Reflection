package lab3;

/**
 * Created by Evegeny on 18/05/2016.
 */
public class Total {
    private int maleSum;
    private int femaleSum;

    public Total(int maleSum, int femaleSum) {
        this.maleSum = maleSum;
        this.femaleSum = femaleSum;
    }


    public Total merge(Total total) {
        return new Total(maleSum+=total.maleSum,
                femaleSum + total.femaleSum);
    }

    public Total() {
    }

    public int getMaleSum() {
        return maleSum;
    }


    public int getFemaleSum() {
        return femaleSum;
    }
}
