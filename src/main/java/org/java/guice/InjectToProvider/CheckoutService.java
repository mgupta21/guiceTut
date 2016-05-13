package org.java.guice.InjectToProvider;

import org.java.guice.InjectToProvider.customFactory.DiscountFactory;
import org.java.guice.InjectToProvider.customFactory.ShoppingCart;

import com.google.inject.Inject;

/**
 * Created by mgupta on 5/11/16.
 */
public class CheckoutService {

    // Injected by provider
    // private final Discountable discountable;

    private final DiscountFactory discountFactory;

    @Inject
    public CheckoutService(DiscountFactory discountFactory) {
        this.discountFactory = discountFactory;
    }

    public double checkout(ShoppingCart cart) {
        Discountable discountable = discountFactory.getDiscount(cart);
        double totalAfterDiscount = cart.getCartTotal() - (cart.getCartTotal() * discountable.getDiscount());
        System.out.printf("%nShopping cart initially [$%.2f] with a discount of %.2f%% = [$%.2f]%n%n", cart.getCartTotal(), discountable.getDiscount() * 100, totalAfterDiscount);
        return totalAfterDiscount;
    }
}
