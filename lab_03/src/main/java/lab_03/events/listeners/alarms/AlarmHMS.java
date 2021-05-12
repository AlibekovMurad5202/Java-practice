/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_03.events.listeners.alarms;

import javax.swing.JOptionPane;
import lab_03.watches.classic_watches.IWatches;

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
            Thread alarmThread = new Thread(new Runnable(){
                public void run(){
                    alarm();
                }
            });
            alarmThread.start();
        }
    }
    
    protected void alarm() {
        System.out.println("ALARM!!!");
        System.out.println("ALARM!!!");
        System.out.println("ALARM!!!");
        JOptionPane.showMessageDialog(null, "Wake up!", "Alarm", JOptionPane.INFORMATION_MESSAGE);
    }
}
