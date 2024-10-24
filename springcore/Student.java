package org.example.springcore;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private Adress adress;

    public Student(String name, Adress adress) {
        this.name = name;
        this.adress = adress;
    }

    public Student() {
        System.out.println("Default Constructor of Student");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("I am setter of name");
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        System.out.println("I am setter of name");
        this.adress = adress;
    }
}
