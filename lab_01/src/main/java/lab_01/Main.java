package lab_01;

import lab_01.watches.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlibekovMurad5202
 */
public class Main {
    public static void main(String[] args) {
        IWatches watchesHM = BWatches.build(WatchesType.WatchesHM, "Wow!!1", 10999.99);
        IWatches watchesHMS = BWatches.build(WatchesType.WatchesHMS, "Wow!!2", 14999.99);
        
        try {
            watchesHM.setHours(11);
            watchesHM.setMinutes(14);
            
            watchesHMS.setHours(06);
            watchesHMS.setMinutes(42);
            watchesHMS.setSeconds(27);
            
            System.err.print(watchesHM + "\n\n");
            watchesHM.addHours(11);
            System.err.print(watchesHM + "\n\n");
            
            watchesHMS.addMinutes(10);
            System.err.print(watchesHMS + "\n\n");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}