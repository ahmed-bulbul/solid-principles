package javatechie.dip.solution;

import javatechie.dip.DebitCard;

public class ShoppingMall {


    private final BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard debitCard = new DebitCard(); //Runtime Polymorphism
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(1000);
    }
}
