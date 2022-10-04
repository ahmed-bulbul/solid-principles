package javatechie.isp;

public class BKash implements UPIPayments {

    @Override
    public void payMoney() {
        System.out.println("paying money using BKash");
    }

    @Override
    public void getScratchCard() {
        System.out.println("getting scratch card using BKash");
    }


}
