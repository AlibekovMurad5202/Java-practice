/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_04.events.listeners;

import lab_04.events.listeners.alarms.IAlarm;
import lab_04.watches.classic_watches.IWatches;

/**
 *
 * @author AlibekovMurad5202
 */
public interface IAlarmListener {
    void handleEvent(IWatches watches, IAlarm alarm) throws Exception;
}
