/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_02.events.publishers;

import java.util.ArrayList;
import lab_02.events.listeners.IWatchesEventListener;
import lab_02.watches.classic_watches.IWatches;

/**
 *
 * @author AlibekovMurad5202
 */
public class WatchesEventManager implements IWatchesEventManager {
    private ArrayList<IWatchesEventListener> listeners = new ArrayList<>();

    // subscribe or addEvent
    @Override
    public void addListener(IWatchesEventListener listener) {
        listeners.add(listener);
    }

    // unsubscribe or removeEvent
    @Override
    public void removeListener(IWatchesEventListener listener) {
        listeners.remove(listener);
    }

    // notify
    @Override
    public void update(IWatches watches) throws Exception {
        for (IWatchesEventListener eventListener : listeners) {
            eventListener.handleEvent(watches);
        }
    }
}
