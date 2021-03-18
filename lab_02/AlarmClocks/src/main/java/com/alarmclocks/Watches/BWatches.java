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
    public static IWatches build(WatchesType type) {
        if (type == WatchesType.WatchesHM)
            return new WatchesHM();
        else if (type == WatchesType.WatchesHMS)
            return new WatchesHMS();
        else
            return null;
    }
}
