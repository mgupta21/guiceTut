package org.java.guice.singleImpl;

/**
 * Created by mgupta on 5/11/16.
 */
public class NoDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.0D;
    }
}
