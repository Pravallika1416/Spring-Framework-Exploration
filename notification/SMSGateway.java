package org.example.notification;

import org.springframework.stereotype.Component;

@Component
public class SMSGateway {
    public void sendSMS(String sms){
        System.out.println(sms);
    }
}
