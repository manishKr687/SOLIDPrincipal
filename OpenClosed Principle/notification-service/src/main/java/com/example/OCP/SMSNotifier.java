package com.example.OCP;

public class SMSNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
