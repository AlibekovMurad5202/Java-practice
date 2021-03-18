/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alarmclocks.AlarmClock;

/**
 *
 * @author murad
 */
public interface IAlarmClock {
    void setHours(int hours) throws Exception;
    void setMinutes(int minutes) throws Exception;
    void setSeconds(int seconds) throws Exception;
    
    int getHours();
    int getMinutes();
    int getSeconds() throws Exception;
}
