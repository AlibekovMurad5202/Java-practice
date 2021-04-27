/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_01.watches;

/**
 *
 * @author AlibekovMurad5202
 */
public class BWatches {
    public static IWatches build(WatchesType type, String brand, double price) {
        switch (type) {
            case WatchesHM:
                return new WatchesHM(brand, price);
            case WatchesHMS:
                return new WatchesHMS(brand, price);
            default:
                return null;
        }
    }
}
