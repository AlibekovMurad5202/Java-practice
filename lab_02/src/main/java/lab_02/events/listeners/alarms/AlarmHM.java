/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_02.events.listeners.alarms;

import lab_02.watches.classic_watches.IWatches;

/**
 *
 * @author AlibekovMurad5202
 */
public class AlarmHM implements IAlarm {
    int h = 0;
    int m = 0;
    
    public AlarmHM(int h, int m) {
        this.h = h;
        this.m = m;
    }
    
    @Override
    public void handleEvent(IWatches watches) throws Exception {
        if ((this.h == watches.getHours()) && this.m == watches.getMinutes()) {
            alarm();
        }
    }
    
    private void alarm() {
        System.out.println("ALARM!!!");
        System.out.println("ALARM!!!");
        System.out.println("ALARM!!!");
    }
    
}
