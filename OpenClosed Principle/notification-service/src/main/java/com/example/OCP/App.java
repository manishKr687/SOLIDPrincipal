package com.example.OCP;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Notifier> notifiers = List.of(new EmailNotifier(), new SMSNotifier(), new PUSHNotifier());
        NotificationService service = new NotificationService(notifiers);
        service.sendToAll("Your order has shipped!");
    }
}
