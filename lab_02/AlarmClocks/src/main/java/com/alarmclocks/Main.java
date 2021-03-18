/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alarmclocks;

import com.alarmclocks.AlarmClock.AlarmClockHMS;
import com.alarmclocks.AlarmClock.IAlarmClock;
import com.alarmclocks.Watches.*;

/**
 *
 * @author murad
 */
public class Main {
    public static void main(String[] args) {
        IWatches watches = BWatches.build(WatchesType.WatchesHMSAlarm, "Wow!!1", 14999.99);
        
        try {
            watches.setHours(11);
            watches.setMinutes(24);
            watches.setSeconds(43);
            
            IAlarmClock alarm1 = new AlarmClockHMS();
            alarm1.setHours(7);
            alarm1.setMinutes(36);
            alarm1.setSeconds(52);
                        
            IAlarmClock alarm2 = new AlarmClockHMS();
            alarm2.setHours(10);
            alarm2.setMinutes(14);
            alarm2.setSeconds(29);
            
            watches.addAlarmClock(alarm1);
            watches.addAlarmClock(alarm2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.err.print(watches);
        
        
        /*
        IWatches watches = BWatches.build(WatchesType.WatchesHM, "Wow!!1", 14999.99);
        
        try {
            watches.setHours(11);
            watches.setMinutes(24);
            watches.setSeconds(43);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.err.print(watches);
        */
    }
}
