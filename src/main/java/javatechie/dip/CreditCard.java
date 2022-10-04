package javatechie.dip;

import javatechie.dip.solution.BankCard;

public class CreditCard implements BankCard {

    @Override
    public void doTransaction(long amount){
        System.out.println("Transaction done using Credit Card");
    }


}
