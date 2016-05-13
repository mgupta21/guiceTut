package org.java.guice.InjectToProvider.customFactory;

import java.util.Map;

import org.java.guice.InjectToProvider.DiscountGuiceModule;
import org.java.guice.InjectToProvider.Discountable;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import static org.java.guice.InjectToProvider.DiscountGuiceModule.DiscountOption.EarlyBird;
import static org.java.guice.InjectToProvider.DiscountGuiceModule.DiscountOption.NightOwl;
import static org.java.guice.InjectToProvider.DiscountGuiceModule.DiscountOption.NoDiscount;

/**
 * Created by mgupta on 5/13/16.
 */
// We cannot inject the data to provider at run time as get() method doesn't take an argument
// To achieve data injection at runtime, use custom factory.
@Singleton
public class CartDiscountFactory implements DiscountFactory {

    final Map<DiscountGuiceModule.DiscountOption, Discountable> discountBinder;

    @Inject
    public CartDiscountFactory(Map<DiscountGuiceModule.DiscountOption, Discountable> mapBinder) {
        this.discountBinder = mapBinder;
    }

    // data is injected at runtime through cart
    @Override
    public Discountable getDiscount(ShoppingCart cart) {
        int currentHour = cart.getTimeOfCheckout().getHour();

        if (isEartlyMorning(currentHour)) {
            return discountBinder.get(EarlyBird);
        } else if (isLateAtNight(currentHour)) {
            return discountBinder.get(NightOwl);
        }

        return discountBinder.get(NoDiscount);
    }

    private boolean isLateAtNight(int currentHour) {
        return (currentHour >= 0 && currentHour <= 4);
    }

    private boolean isEartlyMorning(int currentHour) {
        return (currentHour >= 5 && currentHour <= 9);
    }
}
