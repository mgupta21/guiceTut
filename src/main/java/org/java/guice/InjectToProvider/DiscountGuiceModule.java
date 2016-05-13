package org.java.guice.InjectToProvider;

import java.util.Random;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

/**
 * Created by mgupta on 5/11/16.
 */
public class DiscountGuiceModule extends AbstractModule {

    @Override
    protected void configure() {

        MapBinder<Integer, Discountable> mapBinder = MapBinder.newMapBinder(
            binder(), // Binds a map binder to a map (implicit binding)
            Integer.class, Discountable.class);
        mapBinder.addBinding(0).to(BigDiscount.class);
        mapBinder.addBinding(1).to(SmallDiscount.class);
        mapBinder.addBinding(2).to(NoDiscount.class);

        // Explicit binding
        bind(Random.class).toInstance(new Random());

        bind(Discountable.class).toProvider(DiscountableProvider.class);

    }

}
