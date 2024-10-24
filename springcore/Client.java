package org.example.springcore;

public class Client {
    public static void main(String[] args) {
        Student student=new Student("John",new Adress("Krakow",12345));
        System.out.println(student);
        //stdent class is dependent on Adress.........one class is dependent on another classes object
        //injecting the dependence into Student Class....user is injecting
        //Dependency Injection.......
    //spring....helps in injecting dependency
        //spring does dependency injection more accurately
        //inversion of control
        //depedency Injection comes into picture only when you have has A relationship
        //spring creates an object and keeps in bucket
        //application context
        // beans is a concept in which objects are created and managed by spring inside application context


        //git init git add .
        // //>git remote add origin https://github.com/Pravallika1416/Java_Threading.git
        //git checkout -b learning/multithreading
        //>git push -u origin learning/multithreading
    }
}
