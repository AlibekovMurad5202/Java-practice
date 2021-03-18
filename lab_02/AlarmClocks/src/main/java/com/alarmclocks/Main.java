/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alarmclocks;

import com.alarmclocks.Watches.*;

/**
 *
 * @author murad
 */
public class Main {
    public static void main(String[] args) {
        IWatches watches = BWatches.build(WatchesType.WatchesHM);
        
        try {
            watches.setHours(11);
            watches.setMinutes(24);
            watches.setSeconds(43);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.err.print(watches);
    }
}
