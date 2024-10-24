package org.example.notification;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("org.example.notification");
        NotificationServer notificationServer=(NotificationServer) context.getBean("notificationServer");
//        notificationServer.sendSms("Sending a SMS.......");
        notificationServer.sendMail("sending a Mail..........");

    }
}
