package org.java.guice.InjectToProvider;

/**
 * Created by mgupta on 5/12/16.
 */
public class SmallDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.05D;
    }

}
