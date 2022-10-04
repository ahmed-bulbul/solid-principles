package dip;

import dip.violation.models.Customer;
import dip.violation.models.ShoppingCart;
import dip.violation.services.CheckoutService;


public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sabbir Siddiqui", "01717111111");
        ShoppingCart shoppingCart = new ShoppingCart(1200, customer);


        CheckoutService checkoutService = new CheckoutService();

        checkoutService.checkout(shoppingCart);
    }
}
