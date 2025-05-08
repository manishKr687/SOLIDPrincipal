package com.example.OCP;

import java.util.List;

public class NotificationService {
    private final List<Notifier> notifiers;

    public NotificationService(List<Notifier> notifiers) {
        this.notifiers = notifiers;
    }
    public void sendToAll(String message) {
        for (Notifier notifier : notifiers) {
            notifier.send(message);
        }
    }
}
