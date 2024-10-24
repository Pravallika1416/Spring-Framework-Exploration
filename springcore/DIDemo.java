package org.example.springcore;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIDemo {
    public static void main(String[] args) {


//        Resource resource = new ClassPathResource("projectBean.xml");
//        BeanFactory factory = new XmlBeanFactory(resource); // bucket // applicationcontext // bean factory
//        Student student=(Student) factory.getBean("student");
//        Adress adress=(Adress) factory.getBean("addressRef");
//        System.out.println(student);
//        System.out.println(adress);
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("projectBean.xml");

        Student student=(Student) xmlApplicationContext.getBean("student");
       // Adress adress=(Adress) xmlApplicationContext.getBean("addressRef");
        System.out.println(student);
        //System.out.println(adress);

    }
}
//above version 6 xmlBeanFactory is not a class anymore