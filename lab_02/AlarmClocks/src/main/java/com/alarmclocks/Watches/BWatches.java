/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alarmclocks.Watches;

/**
 *
 * @author murad
 */
public class BWatches {
    public static IWatches build(WatchesType type, String brand, double price) {
        switch (type) {
            case WatchesHM:
                return new WatchesHM(brand, price);
            case WatchesHMS:
                return new WatchesHMS(brand, price);
            case WatchesHMAlarm:
                return new WatchesHMAlarm(brand, price);
            case WatchesHMSAlarm:
                return new WatchesHMSAlarm(brand, price);
            default:
                return null;
        }
    }
}
