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
public interface IWatches {
    void setHours(int hours) throws Exception;
    void setMinutes(int minutes) throws Exception;
    void setSeconds(int seconds) throws Exception;
    
    void addHours(int hours);
    void addMinutes(int minutes);
    void addSeconds(int seconds) throws Exception;
}
