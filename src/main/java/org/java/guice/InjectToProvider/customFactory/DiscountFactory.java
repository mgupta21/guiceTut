package org.java.guice.InjectToProvider.customFactory;

import org.java.guice.InjectToProvider.Discountable;

import com.google.inject.ImplementedBy;

/**
 * Created by mgupta on 5/13/16.
 */
@ImplementedBy(CartDiscountFactory.class)
public interface DiscountFactory {

    Discountable getDiscount(ShoppingCart cart);
}
