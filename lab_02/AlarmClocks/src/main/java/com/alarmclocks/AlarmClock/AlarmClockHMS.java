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
public class AlarmClockHMS extends AlarmClockHM {
    int seconds = 0;
    
    @Override
    public void setSeconds(int seconds) throws Exception {
        if ((seconds < 0) || (seconds > 59)) {
            throw new Exception("Invalid value of seconds");
        }
        this.seconds = seconds;
    }
    
    @Override
    public int getSeconds() throws Exception {
        return seconds;
    }
    
    @Override
    public String toString() {
       return hours + ":" + minutes + ":" + seconds;
    }
}
