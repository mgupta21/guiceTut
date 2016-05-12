package org.java.guice.singleImpl;

import com.google.inject.AbstractModule;

/**
 * Created by mgupta on 5/11/16.
 */
public class DiscountGuiceModule extends AbstractModule {

    @Override
    protected void configure() {

        // Alt. 1 : Binding to specific implementation
        // bind(Discountable.class).to(NightOwlDiscount.class);
        // bind(Discountable.class).to(EarlyBirdDiscount.class);

        // Alt. 2 : Binding to custom provider
        // bind(Discountable.class).toProvider(DiscountProvider.class);

        // Alt 4 : check @providedBy in module

    }

    // Alt 3 : Defining provider in module
    /*
     * @Provides
     * public Discountable get() {
     * int hour = LocalTime.now().getHour();
     * if (isEarlyMorning(hour)) {
     * return new EarlyBirdDiscount();
     * }
     * if (isLateNight(hour)) {
     * return new NightOwlDiscount();
     * }
     * return new NoDiscount();
     * }
     * private boolean isLateNight(int hour) {
     * return hour >= 0 && hour <= 4;
     * }
     * private boolean isEarlyMorning(int hour) {
     * return hour >= 5 && hour <= 9;
     * }
     */

}
