package org.java.guice.singleImpl;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DiscountGuiceModule());
        CheckoutService service = injector.getInstance(CheckoutService.class);
        service.checkout(3165.00d);
    }
}
