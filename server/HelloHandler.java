package org.example.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response="I am in Hello Handler";
        exchange.sendResponseHeaders(200,response.length());
        OutputStream stream=exchange.getResponseBody();
stream.write(response.getBytes());
stream.flush();
stream.close();
    }
}
