/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_04.events.publishers;

import java.util.ArrayList;
import lab_04.events.listeners.IAlarmListener;
import lab_04.events.listeners.IWatchesEventListener;
import lab_04.events.listeners.alarms.IAlarm;
import lab_04.server.ModelDataObject;
import lab_04.server.Request;
import lab_04.watches.alarm_clocks.IAlarmClock;
import lab_04.watches.classic_watches.IWatches;

/**
 *
 * @author AlibekovMurad5202
 */
public class ServerModel extends ServerEventPublisher 
        implements IWatchesEventListener, IAlarmListener {
    public ArrayList<ModelDataObject> clocks = new ArrayList<>();
    
    public void addClock(IAlarmClock clock) {
        ModelDataObject modelClock = new ModelDataObject(clock);
        clocks.add(modelClock);
        clocks.get(clocks.size() - 1).clock.addEvent(this);
        update();
    }
        
    public void addAlarm(IAlarm alarm, int clockID) {
        alarm.addListener(this);
        clocks.get(clockID).addAlarm(alarm);
        update();
    }

    @Override
    public void handleEvent(IWatches watches) throws Exception {
        for (int i = 0; i < clocks.size(); i++) {
            if (clocks.get(i).clock == watches) {
                Request req = new Request();
                req.setWatchesID(i);
                req.setH(watches.getHours());
                req.setM(watches.getMinutes());
                try {
                    req.setS(watches.getSeconds());
                } catch (Exception ex) {
                } finally {
                    req.setRequestType(11);
                    allRequests.addRequest(req);
                }
            }
        }
        update();
    }

    @Override
    public void handleEvent(IWatches watches, IAlarm alarm) throws Exception {
        for (int i = 0; i < clocks.size(); i++) {
            if (clocks.get(i).clock == watches) {
                Request req = new Request();
                req.setWatchesID(i);
                req.setH(watches.getHours());
                req.setM(watches.getMinutes());
                try {
                    req.setS(watches.getSeconds());
                } catch (Exception ex) {
                } finally {
                    req.setRequestType(10);
                    allRequests.addRequest(req);
                    clocks.get(i).clock.removeAlarm(alarm);
                    clocks.get(i).alarms.remove(alarm);
                }
            }
        }
        update();
    }
}
