package org.java.guice.InjectToProvider.customFactory;

import java.time.LocalTime;

/**
 * Created by mgupta on 5/13/16.
 */
public class ShoppingCart {

    private double    cartTotal;
    private LocalTime timeOfCheckout;

    public double getCartTotal() {
        return this.cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }

    public LocalTime getTimeOfCheckout() {
        return timeOfCheckout;
    }

    public void setTimeOfCheckout(LocalTime timeOfCheckout) {
        this.timeOfCheckout = timeOfCheckout;
    }

}
