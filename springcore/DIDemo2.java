package org.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIDemo2 {
    public static void main(String[] args) {
       ApplicationContext context= new AnnotationConfigApplicationContext("org.example.springcore");
        Student student=(Student) context.getBean("student");
        System.out.println(student);
    }
}
