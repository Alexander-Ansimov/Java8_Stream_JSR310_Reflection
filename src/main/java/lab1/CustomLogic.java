package lab1;

/**
 * Created by Evegeny on 18/05/2016.
 */
@FunctionalInterface
public interface CustomLogic<T> {
    void apply(T t);
    default void zyc(){
        System.out.println(123);
    }
}
