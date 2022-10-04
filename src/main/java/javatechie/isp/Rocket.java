package javatechie.isp;

public class Rocket implements UPIPayments {

    @Override
    public void payMoney() {
        System.out.println("paying money using rocket");
    }

    @Override
    public void getScratchCard() {
        System.out.println("getting scratch card using rocket");
    }


}
