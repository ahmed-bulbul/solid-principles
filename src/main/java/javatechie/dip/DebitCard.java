package javatechie.dip;

import javatechie.dip.solution.BankCard;

public class DebitCard implements BankCard {

    @Override
    public void doTransaction(long amount){
        System.out.println("Transaction done using Debit Card");
    }
}
