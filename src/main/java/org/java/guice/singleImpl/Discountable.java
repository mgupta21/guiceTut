package org.java.guice.singleImpl;

import com.google.inject.ImplementedBy;

/**
 * Created by mgupta on 5/11/16.
 */
// Provides default implementation. Works if binding are not defined in the module. Binding takes precedence over implemented by
@ImplementedBy(NightOwlDiscount.class)
public interface Discountable {

    double getDiscount();
}
