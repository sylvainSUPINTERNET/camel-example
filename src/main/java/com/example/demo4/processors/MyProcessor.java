package com.example.demo4.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        String msg = exchange.getIn().getBody(String.class); 
        System.out.println("Hello world from processor " + msg);
    }
    
}
