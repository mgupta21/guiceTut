package org.java.guice.InjectToProvider;

import org.java.guice.InjectToProvider.customFactory.UserInterfaceUtil;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Created by mgupta on 5/12/16.
 */
public class App {

    private final CheckoutService checkoutService;

    @Inject
    public App(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public static void main(String[] args) {

        // Create object graph of factories
        Injector injector = Guice.createInjector(new DiscountGuiceModule());

        // Instantiate application : creates object graph of business logic
        App application = injector.getInstance(App.class);

        application.start();
    }

    void start() {
        // checkoutService.checkout(100.0D);
        checkoutService.checkout(new UserInterfaceUtil().getUserCheckoutCart());
    }

}
