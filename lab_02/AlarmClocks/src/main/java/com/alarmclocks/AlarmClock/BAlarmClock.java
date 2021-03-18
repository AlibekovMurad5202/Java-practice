/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alarmclocks.AlarmClock;

import com.alarmclocks.Watches.WatchesType;

/**
 *
 * @author murad
 */
public class BAlarmClock {
    public static IAlarmClock build(WatchesType type) {
        if (type == WatchesType.WatchesHMAlarm)
                return new AlarmClockHM();
        else if (type == WatchesType.WatchesHMSAlarm)
                return new AlarmClockHMS();
        else return null;
    }
}
