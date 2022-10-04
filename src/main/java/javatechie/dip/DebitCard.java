package javatechie.dip;

public class DebitCard implements BankCard {

    @Override
    public void doTransaction(long amount){
        System.out.println("Transaction done using Debit Card");
    }
}
