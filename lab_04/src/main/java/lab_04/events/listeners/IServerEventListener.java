/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_04.events.listeners;

import lab_04.events.publishers.IServerEventPublisher;

/**
 *
 * @author AlibekovMurad5202
 */
public interface IServerEventListener extends IEventListener {
    public void handleEvent(IServerEventPublisher model);
}
