/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_04.events.listeners.alarms;

import lab_04.events.listeners.IWatchesEventListener;
import lab_04.events.publishers.IAlarmPublisher;

/**
 *
 * @author AlibekovMurad5202
 */
public interface IAlarm extends IAlarmPublisher, IWatchesEventListener {
    
}
