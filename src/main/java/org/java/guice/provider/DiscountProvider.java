package org.java.guice.provider;

import java.time.LocalTime;

import org.java.guice.singleImpl.Discountable;
import org.java.guice.singleImpl.EarlyBirdDiscount;
import org.java.guice.singleImpl.NightOwlDiscount;
import org.java.guice.singleImpl.NoDiscount;

import com.google.inject.Provider;

/**
 * Created by mgupta on 5/11/16.
 */
public class DiscountProvider implements Provider<Discountable> {

    /*
     * @Override
     * public Discountable get() {
     * return new NoDiscount();
     * }
     */

    @Override
    public Discountable get() {

        int hour = LocalTime.now().getHour();

        if (isEarlyMorning(hour)) {
            return new EarlyBirdDiscount();
        }

        if (isLateNight(hour)) {
            return new NightOwlDiscount();
        }

        return new NoDiscount();
    }

    private boolean isLateNight(int hour) {
        return hour >= 0 && hour <= 4;
    }

    private boolean isEarlyMorning(int hour) {
        return hour >= 5 && hour <= 9;
    }
}
