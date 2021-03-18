/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alarmclocks.Watches;

import com.alarmclocks.AlarmClock.IAlarmClock;

/**
 *
 * @author murad
 */
public interface IWatches {
    void setHours(int hours) throws Exception;
    void setMinutes(int minutes) throws Exception;
    void setSeconds(int seconds) throws Exception;
    
    void addHours(int hours) throws Exception;
    void addMinutes(int minutes) throws Exception;
    void addSeconds(int seconds) throws Exception;
    
    String getBrand();
    double getPrice();
    int getHours();
    int getMinutes();
    int getSeconds() throws Exception;
    
    void addAlarmClock(IAlarmClock alarmClock) throws Exception;
    Boolean isAlarmed() throws Exception;
    void Alarm() throws Exception;
}
