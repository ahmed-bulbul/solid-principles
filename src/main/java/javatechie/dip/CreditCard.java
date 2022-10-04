package javatechie.dip;

public class CreditCard implements BankCard {

    @Override
    public void doTransaction(long amount){
        System.out.println("Transaction done using Credit Card");
    }


}
