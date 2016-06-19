package lab1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 18/05/2016.
 */
public class LambdaUtils {
    public static <T> void forEachWithDelay(List<T> list, int delay, CustomLogic customLogic) throws InterruptedException {
        for (T t : list) {
            customLogic.apply(t);
            Thread.sleep(delay);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<String> strings = Arrays.asList("java 8", " spark ", " groovy");
        forEachWithDelay(strings,1500,s-> System.out.println(s));
    }
}








