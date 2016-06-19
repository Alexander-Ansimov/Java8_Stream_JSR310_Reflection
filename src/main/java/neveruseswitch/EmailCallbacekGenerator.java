package neveruseswitch;

/**
 * Created by Evegeny on 19/05/2016.
 */
@MailCode(2)
@MailCode(3)
public class EmailCallbacekGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        return "don't call us we call you";
    }
}
