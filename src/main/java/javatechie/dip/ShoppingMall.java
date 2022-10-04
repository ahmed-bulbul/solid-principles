package javatechie.dip;

public class ShoppingMall {

  //  private DebitCard debitCard; //ShoppingMall depends on DebitCard

    BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
      //  DebitCard debitCard = new DebitCard();

        BankCard debitCard = new DebitCard(); //Runtime Polymorphism
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(1000);
    }
}
