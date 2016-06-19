package neveruseswitch;

import java.util.Random;

/**
 * Created by Evegeny on 19/05/2016.
 */
public class DBUtils {
    private static Random random = new Random();
    public static MailInfo getMailInfo() {
        return new MailInfo(random.nextInt(3) + 1);
    }
}
