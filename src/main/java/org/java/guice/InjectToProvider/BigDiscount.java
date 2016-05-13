package org.java.guice.InjectToProvider;

/**
 * Created by mgupta on 5/12/16.
 */
public class BigDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.35D;
    }

}
