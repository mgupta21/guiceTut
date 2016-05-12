package org.java.guice;

import org.java.guice.singleImpl.CheckoutService;
import org.java.guice.singleImpl.DiscountGuiceModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DiscountGuiceModule());
        CheckoutService service = injector.getInstance(CheckoutService.class);
        service.checkout(3165.00d);
    }
}
