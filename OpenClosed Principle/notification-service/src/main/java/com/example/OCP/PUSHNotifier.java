package com.example.OCP;

public class PUSHNotifier implements Notifier{

    @Override
    public void send(String message) {
        System.out.println("Push Notification:" + message);
    }
}
