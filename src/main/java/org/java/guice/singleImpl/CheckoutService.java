package org.java.guice.singleImpl;

import com.google.inject.Inject;

/**
 * Created by mgupta on 5/11/16.
 */
public class CheckoutService {

    private final Discountable discountable;

    @Inject
    public CheckoutService(Discountable discountable) {
        this.discountable = discountable;
    }

    public double checkout(double shoppingCartTotal) {
        double totalAfterDiscount = shoppingCartTotal - (shoppingCartTotal * discountable.getDiscount());
        System.out.printf("%nShopping cart initially [$%.2f] with a discount of %.2f%% = [$%.2f]%n%n", shoppingCartTotal, discountable.getDiscount() * 100, totalAfterDiscount);
        return totalAfterDiscount;
    }
}
