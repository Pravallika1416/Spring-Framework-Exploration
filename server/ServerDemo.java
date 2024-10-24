package org.example.server;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter Input:");
        Scanner scanner=new Scanner(System.in);
        while (true){
            String data=scanner.nextLine();
            ExecutorService service = Executors.newFixedThreadPool(4);

            service.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("I am running with the data :"+ data+ " with  thread name : "+ Thread.currentThread().getName());
                }
            });

        }
    }
}
