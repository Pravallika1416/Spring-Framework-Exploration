package org.example.notification;

import org.springframework.stereotype.Component;

@Component
public class MailGateway {
    public void sendMAIL(String mail){
        System.out.println(mail);
    }
}
