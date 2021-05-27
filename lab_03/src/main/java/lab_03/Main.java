/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_03;

import lab_03.events.listeners.alarms.AlarmHMS;
import lab_03.events.listeners.alarms.IAlarm;
import lab_03.watches.alarm_clocks.IAlarmClock;
import lab_03.watches.classic_watches.IWatches;
import lab_03.watches.*;

/**
 *
 * @author AlibekovMurad5202
 */
public class Main {
    public static void main(String[] args) {
        IWatches watchesHM = BWatches.build(WatchesType.WatchesHM, "Wow!!1", 10999.99);
        IWatches watchesHMS = BWatches.build(WatchesType.WatchesHMS, "Wow!!2", 14999.99);
        IAlarmClock alarmClockHM = BAlarmClock.build(WatchesType.AlarmClockHM, "Wow!!3", 12999.99);
        IAlarmClock alarmClockHMS = BAlarmClock.build(WatchesType.AlarmClockHMS, "Wow!!4", 16999.99);
        
        
        try {
            watchesHM.setHours(10);
            watchesHM.setMinutes(54);
            
            System.out.println("Start time: [" + watchesHM + "]");
            for (int i = 1; i < 10; i++) {
                watchesHM.increaseTime();
                System.out.println("After " + i + " ticks: [" + watchesHM + "]");
            }
            System.out.println("Final time: [" + watchesHM + "]\n");
            
            
            watchesHMS.setHours(06);
            watchesHMS.setMinutes(42);
            watchesHMS.setSeconds(27);
            
            System.out.println("Start time: [" + watchesHMS + "]");
            for (int i = 1; i < 10; i++) {
                watchesHMS.increaseTime();
                System.out.println("After " + i + " ticks: [" + watchesHMS + "]");
            }
            System.out.println("Final time: [" + watchesHMS + "]\n");
            
            
            alarmClockHM.setHours(10);
            alarmClockHM.setMinutes(54);
            alarmClockHM.addAlarm(11, 00);
            
            System.out.println("Start time: [" + alarmClockHM + "]");
            for (int i = 1; i < 10; i++) {
                alarmClockHM.increaseTime();
                System.out.println("After " + i + " ticks: [" + alarmClockHM + "]");
            }
            System.out.println("Final time: [" + alarmClockHM + "]\n");
            
            
            alarmClockHMS.setHours(06);
            alarmClockHMS.setMinutes(42);
            alarmClockHMS.setSeconds(27);
            
            alarmClockHMS.addAlarm(06, 42, 29);
            IAlarm alarm2 = new AlarmHMS(06, 42, 31);
            alarmClockHMS.addAlarm(alarm2);
            
            IAlarm alarm3 = new AlarmHMS(06, 42, 34);
            alarmClockHMS.addAlarm(alarm3);
            alarmClockHMS.removeAlarm(alarm3);
            
            System.out.println("Start time: [" + alarmClockHMS + "]");
            for (int i = 1; i < 10; i++) {
                alarmClockHMS.increaseTime();
                System.out.println("After " + i + " ticks: [" + alarmClockHMS + "]");
            }
            System.out.println("Final time: [" + alarmClockHMS + "]\n");
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}