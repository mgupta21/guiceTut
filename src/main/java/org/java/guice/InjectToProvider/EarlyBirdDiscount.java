package org.java.guice.InjectToProvider;

/**
 * Created by mgupta on 5/11/16.
 */
public class EarlyBirdDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.25;
    }
}
