package ca.onepoint.yul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.simp.SimpMessageSendingOperations;

@SpringBootApplication
public class YulCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(YulCodeApplication.class, args);
    }

}
