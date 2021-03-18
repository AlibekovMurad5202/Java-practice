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
public class WatchesHM implements IWatches {
    int hours = 0;
    int minutes = 0;

    @Override
    public void setHours(int hours) throws Exception {
        if ((hours < 0) || (hours > 11)) {
            throw new Exception("Invalid value of hours");
        }
        this.hours = hours;
    }

    @Override
    public void setMinutes(int minutes) throws Exception {
        if ((minutes < 0) || (minutes > 59)) {
            throw new Exception("Invalid value of minutes");
        }
        this.minutes = minutes;
    }

    @Override
    public void setSeconds(int seconds) throws Exception {
        throw new Exception("There are not second hands");
    }
    
    @Override
    public String toString() {
       return hours + ":" + minutes;
    }

    @Override
    public void addHours(int hours) {
        this.hours = (this.hours + hours) % 12;
    }

    @Override
    public void addMinutes(int minutes) {
        this.hours = (this.hours + (this.minutes + minutes) / 60) % 12;
        this.minutes = (this.minutes + minutes) % 60;
    }

    @Override
    public void addSeconds(int seconds) throws Exception {
        throw new Exception("There are not second hands");
    }
}
