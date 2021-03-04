package com.watches;

import com.watches.Watches.WatchPrototype;
import com.watches.Watches.WatchWithoutSecondHand;
import com.watches.Watches.WatchWithSecondHand;

/**
 *
 * @author murad
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello world!");
        
        WatchWithoutSecondHand watch_1 = new WatchWithoutSecondHand("Ouch!!1", 14999);
        System.out.println("Watch #1: ");
        System.out.println("\tBrand: " + watch_1.getBrand());
        System.out.println("\tPrice: " + watch_1.getPrice());
        try {
            watch_1.setTime(10, 26);
            System.out.println("\tCurrent time: "
                + watch_1.getHours() + ":" + watch_1.getMinutes());
            watch_1.addTime(3, 8);
            System.out.println("\tTime after 3h and 8m: "
                + watch_1.getHours() + ":" + watch_1.getMinutes());
        } catch (Exception ex) {
            System.err.println("  " + ex.getMessage());
        }
        
        WatchWithSecondHand watch_2 = new WatchWithSecondHand("Wow!!1", 19999);
        System.out.println("Watch #2: ");
        System.out.println("\tBrand: " + watch_2.getBrand());
        System.out.println("\tPrice: " + watch_2.getPrice());
        try {
            watch_2.setTime(10, 26, 52);
            System.out.println("\tCurrent time: "
                + watch_2.getHours() + ":"
                + watch_2.getMinutes() + ":"
                + watch_2.getSeconds());
            watch_2.addTime(3, 8, 17);
            System.out.println("\tTime after 3h and 8m and 17s: "
                + watch_2.getHours() + ":"
                + watch_2.getMinutes() + ":"
                + watch_2.getSeconds());
        } catch (Exception ex) {
            System.err.println("  " + ex.getMessage());
        }
        
        WatchWithoutSecondHand watch_3 = new WatchWithoutSecondHand("Ouch!!1", 99);
        System.out.println("Watch #3: ");
        System.out.println("\tBrand: " + watch_3.getBrand());
        System.out.println("\tPrice: " + watch_3.getPrice());
        try {
            watch_1.setTime(10, 86);                // <---- error
            System.out.println("\tCurrent time: "
                + watch_1.getHours() + ":" + watch_1.getMinutes());
            watch_1.addTime(3, 8);
            System.out.println("\tTime after 3h and 8m: "
                + watch_1.getHours() + ":" + watch_1.getMinutes());
        } catch (Exception ex) {
            System.err.println("  " + ex.getMessage());
        }
    }
}
