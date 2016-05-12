package org.java.guice.singleImpl;

import org.java.guice.provider.DiscountProvider;

import com.google.inject.ProvidedBy;

/**
 * Created by mgupta on 5/11/16.
 */
// Provides default implementation. Works if binding are not defined in the module. Binding takes precedence over implemented by
// @ImplementedBy(NightOwlDiscount.class)
// No need to bind to provider in module with this annotation
@ProvidedBy(DiscountProvider.class)
public interface Discountable {

    double getDiscount();
}
