package neveruseswitch;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Evegeny on 19/05/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MailCodes {
    MailCode[] value();
}
