package javatechie.srp;

public class NotificationService {

    public void sendOTP(String medium){
        if(medium.equals("email")) {
            //send email logic
        }
        if(medium.equals("sms")) {
            //send sms logic
        }
    }
}
