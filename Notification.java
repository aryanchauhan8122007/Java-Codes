class Notification {
    void send() {
        System.out.println("Sending notification...");
    }
}

class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending Email Notification 📧");
    }
}

class SMSNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending SMS Notification 📱");
    }
}

class PushNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending Push Notification 🔔");
    }
}

public class Code10_Notification {
    public static void main(String[] args) {

        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();
        Notification n3 = new PushNotification();

        n1.send();
        n2.send();
        n3.send();
    }
}
