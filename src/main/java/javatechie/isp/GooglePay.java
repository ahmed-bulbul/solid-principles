package javatechie.isp;

public class GooglePay implements UPIPayments,CashBackManager {

    @Override
    public void payMoney() {
        System.out.println("paying money using google pay");
    }

    @Override
    public void getScratchCard() {
        System.out.println("getting scratch card using google pay");
    }


    @Override
    public void getCashBackCreditBalance() {
        System.out.println("getting cash back credit balance using google pay");
    }
}

