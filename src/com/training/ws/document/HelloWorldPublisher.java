package com.training.ws.document;

//Endpoint publisher
public class HelloWorldPublisher {

    public static void main(String[] args) {
        javax.xml.ws.Endpoint.publish("http://localhost:7779/ws/hello", new com.training.ws.document.HelloWorldImpl());
    }

}