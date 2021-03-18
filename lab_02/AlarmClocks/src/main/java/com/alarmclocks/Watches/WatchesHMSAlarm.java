/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alarmclocks.Watches;

import com.alarmclocks.AlarmClock.IAlarmClock;
import java.util.LinkedList;

/**
 *
 * @author murad
 */
public class WatchesHMSAlarm extends WatchesHMS {
    protected LinkedList<IAlarmClock> alarmClocks = new LinkedList<>();;
    
    public WatchesHMSAlarm(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void addAlarmClock(IAlarmClock alarm) {
        alarmClocks.add(alarm);
    }
        
    @Override
    public void addHours(int hours) throws Exception {
        super.addHours(hours);
        Alarm();
    }

    @Override
    public void addMinutes(int minutes) throws Exception {
        super.addMinutes(minutes);
        Alarm();
    }

    @Override
    public void addSeconds(int seconds) throws Exception {
        super.addSeconds(seconds);
        Alarm();
    }
    
    @Override
    public Boolean isAlarmed() throws Exception {
        for (IAlarmClock alarmClock : alarmClocks) {
            if ((alarmClock.getHours() == this.hours) 
             && (alarmClock.getMinutes() == this.minutes)
             && (alarmClock.getSeconds() == this.seconds))
                return true;
        }
        return false;
    }

    @Override
    public void Alarm() throws Exception {
        if (isAlarmed()) {
            System.out.println("ALARM!");
            System.out.println("ALARM!");
            System.out.println("ALARM!");
        }
    }
        
    @Override
    public String toString() {
        String alarms = "\nAlarms: ";
        for (IAlarmClock alarmClock : alarmClocks) {
            alarms = alarms + "\n[" + alarmClock + "]";
        }
       return (hours + ":" + minutes + ":" + seconds) + alarms;
    }
}
