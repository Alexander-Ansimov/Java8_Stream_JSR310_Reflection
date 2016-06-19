package multipleInheritance;

/**
 * Created by Evegeny on 18/05/2016.
 */
public class C extends D implements X {

    @Override
    public void a() {
        X.super.a();
    }
}
