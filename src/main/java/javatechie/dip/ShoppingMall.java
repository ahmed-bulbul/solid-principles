package javatechie.dip;

public class ShoppingMall {

    private DebitCard debitCard; //ShoppingMall depends on DebitCard


    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPurchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(1000);
    }
}
