/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_02.watches.alarm_clocks;

import lab_02.events.listeners.alarms.IAlarm;
import lab_02.watches.classic_watches.IWatches;

/**
 *
 * @author AlibekovMurad5202
 */
public interface IAlarmClock extends IWatches {
    void addAlarm(int ... time) throws Exception;
    void removeAlarm(int ... time) throws Exception;
    void addAlarm(IAlarm alarm) throws Exception;
    void removeAlarm(IAlarm alarm) throws Exception;
}
