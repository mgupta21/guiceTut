package org.java.guice.singleImpl;

import com.google.inject.AbstractModule;

/**
 * Created by mgupta on 5/11/16.
 */
public class DiscountGuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Discountable.class).to(NightOwlDiscount.class);
    }
}
