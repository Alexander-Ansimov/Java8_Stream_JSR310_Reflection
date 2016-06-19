package neveruseswitch;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Evegeny on 19/05/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MailCodes.class)
public @interface MailCode {
    int value();
}
