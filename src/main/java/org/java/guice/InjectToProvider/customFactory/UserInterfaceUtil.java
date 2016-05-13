package org.java.guice.InjectToProvider.customFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

/**
 * Created by mgupta on 5/13/16.
 */
public class UserInterfaceUtil {

    public ShoppingCart getUserCheckoutCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.setCartTotal(getTotalFromInput());
        cart.setTimeOfCheckout(getCheckoutTimeFromInput());
        return cart;
    }

    private LocalTime getCheckoutTimeFromInput() {

        String hour = null;
        System.out.println("Enter checkout hour (in 24hr format) : ");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            hour = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return LocalTime.of(Integer.valueOf(hour), 0);
    }

    private double getTotalFromInput() {

        String total = null;
        System.out.println("Enter cart total : ");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            total = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Double.valueOf(total);
    }

}
