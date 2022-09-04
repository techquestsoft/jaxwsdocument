package com.training.ws.document;

//Service Implementation
@javax.jws.WebService(endpointInterface = "com.training.ws.document.HelloWorld")
public class HelloWorldImpl implements com.training.ws.document.HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

}