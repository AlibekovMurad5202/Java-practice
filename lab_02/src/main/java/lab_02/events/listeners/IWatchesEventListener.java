/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_02.events.listeners;

import lab_02.watches.classic_watches.IWatches;

/**
 *
 * @author AlibekovMurad5202
 */
public interface IWatchesEventListener {
    void handleEvent(IWatches watches) throws Exception;
}
