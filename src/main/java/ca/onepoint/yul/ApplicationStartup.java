package ca.onepoint.yul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;
    public static int secondes = 0;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        try {
            int secondes = 0;
            while (true) {
                Thread.sleep(1000);
                secondes++;
                if (secondes == 86400) {
                    secondes = 0;
                }
                messagingTemplate.convertAndSend("/topic/progress", secondes);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
