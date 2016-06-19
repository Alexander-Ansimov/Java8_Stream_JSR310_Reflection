package neveruseswitch;

/**
 * Created by Evegeny on 19/05/2016.
 */
@MailCode(1)
public class WelcomeGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        return "WELCOME NEW CLIENT";
    }
}
