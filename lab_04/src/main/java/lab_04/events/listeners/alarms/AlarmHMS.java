/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_04.events.listeners.alarms;

import javax.swing.JOptionPane;
import lab_04.events.listeners.IAlarmListener;
import lab_04.watches.classic_watches.IWatches;

/**
 *
 * @author AlibekovMurad5202
 */
public class AlarmHMS implements IAlarm {
    int h = 0;
    int m = 0;
    int s = 0;
    
    public AlarmHMS(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
    
    @Override
    public void handleEvent(IWatches watches) throws Exception {
        if ((this.h == watches.getHours())
          && this.m == watches.getMinutes()
          && this.s == watches.getSeconds()) {
            update(watches);
        }
    }
    
    @Override
    public void update(IWatches watches) throws Exception {
        for (IAlarmListener eventListener : alarmListeners) {
            eventListener.handleEvent(watches, this);
            removeListener(eventListener);
        }
    }

    @Override
    public void addListener(IAlarmListener listener) {
        alarmListeners.add(listener);
    }

    @Override
    public void removeListener(IAlarmListener listener) {
        alarmListeners.remove(listener);
    }
}
