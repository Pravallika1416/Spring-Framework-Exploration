package org.example.server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class webserver {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer=HttpServer.create(new InetSocketAddress("localhost",8080),0);
        httpServer.setExecutor(Executors.newFixedThreadPool(3));
        httpServer.createContext("/hello",new HelloHandler());
        httpServer.start();
    }
}
