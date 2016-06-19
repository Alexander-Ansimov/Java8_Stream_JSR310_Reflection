package solutions.lab1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 17/05/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> strings = Arrays.asList("java", "groovy", "spark");
        LambdaUtils.forEachWithDelay(strings,2200, System.out::println);
    }
}
