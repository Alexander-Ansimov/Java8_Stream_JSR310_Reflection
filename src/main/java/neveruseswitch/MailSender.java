package neveruseswitch;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Evegeny on 19/05/2016.
 */
public class MailSender {

    private Map<Integer, MailGenerator> map = new HashMap<>();

    public MailSender() throws IllegalAccessException, InstantiationException {
        Reflections reflections = new Reflections("neveruseswitch"); // name of package to scan
        Set<Class<? extends MailGenerator>> classes = reflections.getSubTypesOf(MailGenerator.class);
        for (Class<? extends MailGenerator> aClass : classes) {
            MailCode[] annotations = aClass.getAnnotationsByType(MailCode.class);
            for (MailCode annotation : annotations) {
                map.put(annotation.value(), aClass.newInstance());
            }
        }
    }

    public void sendMail(){
        MailInfo mailInfo = DBUtils.getMailInfo();
        MailGenerator mailGenerator = map.get(mailInfo.getType());
        String body = mailGenerator.generateBody();
        send(body);

    }

    private void send(String body) {
        System.out.println("sending.. "+body);
    }

}














