package javatechie.ocp;

public class SendOtp {

    public static void main(String[] args) {
        NotificationService service = new EmailNotificationService(); //Runtime Polymorphism
        service.sendOTP("email");
    }
}
