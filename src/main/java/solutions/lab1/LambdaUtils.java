package solutions.lab1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by Evegeny on 17/05/2016.
 */
public class LambdaUtils {
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> supplier) throws InterruptedException {
        for (T t : list) {
            supplier.accept(t);
            Thread.sleep(delay);
        }
    }
}
