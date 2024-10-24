package org.example.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //Spring will be creating bean of this particular Class
public class NotificationServer {
//    @Autowired
//    private SMSGateway smsGateway;
//    //field Dependency Injection.........
//    @Autowired
//    private MailGateway mailGateway;
//    public void sendSms(String sms){
//        smsGateway.sendSMS(sms);
//
//    }
//    private void sendMail(String mail){
//        mailGateway.sendMAIL(mail);
//    }
  //  @Autowired


    private  SMSGateway sms; //to mae it immutable
    private  MailGateway mail;
    //@Autowired

//    public NotificationServer(SMSGateway smsGateway, MailGateway mail) {
//        this.sms=smsGateway;
//        this.mail = mail;
//    }
//    public void sendSms(String smsMessage){
//        sms.sendSMS(smsMessage);
//    }
//
//    public void sendMail(String mailMessage){
//        mail.sendMAIL(mailMessage);
//    }

@Autowired
    public void setSms(SMSGateway sms) {
        this.sms = sms;
    }
@Autowired
    public void setMail(MailGateway mail) {
        this.mail = mail;
    }
        public void sendSms(String smsMessage){
        sms.sendSMS(smsMessage);
    }

    public void sendMail(String mailMessage){
        mail.sendMAIL(mailMessage);
    }
}
