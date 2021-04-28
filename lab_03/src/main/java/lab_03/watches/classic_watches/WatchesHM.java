/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_03.watches.classic_watches;

import lab_03.events.listeners.IWatchesEventListener;
import lab_03.events.publishers.IWatchesEventManager;
import lab_03.events.publishers.WatchesEventManager;

/**
 *
 * @author AlibekovMurad5202
 */
public class WatchesHM implements IWatches {
    protected String brand;
    protected double price;
    protected int hours = 0;
    protected int minutes = 0;
    
    Thread thread;
    boolean flag = false;
    
    public IWatchesEventManager events;

    public WatchesHM(String brand, double price) {
        this.brand = brand;
        this.price = price;
        
        events = new WatchesEventManager();
    } 
    
    public String getBrand() {
        return brand;
    }
    
    public double getPrice() {
        return price;
    }
    
    @Override
    public void setHours(int hours) throws Exception {
        if ((hours < 0) || (hours > 11)) {
            throw new Exception("Invalid value of hours");
        }
        this.hours = hours;
    }

    @Override
    public void setMinutes(int minutes) throws Exception {
        if ((minutes < 0) || (minutes > 59)) {
            throw new Exception("Invalid value of minutes");
        }
        this.minutes = minutes;
    }

    @Override
    public void setSeconds(int seconds) throws Exception {
        throw new Exception("There are not second hands");
    }
    
    @Override
    public String toString() {
       return hours + ":" + minutes;
    }

    @Override
    public int getHours() {
        return hours;
    }

    @Override
    public int getMinutes() {
        return minutes;
    }

    @Override
    public int getSeconds() throws Exception {
        throw new Exception("There are not second hands");
    }

    @Override
    public void increaseTime() throws Exception {
        this.addMinutes(1);
        events.update(this);
    }

    protected void addMinutes(int minutes) {
        this.hours = (this.hours + (this.minutes + minutes) / 60) % 12;
        this.minutes = (this.minutes + minutes) % 60;
    }

    @Override
    public void start() throws InterruptedException {
        if (thread == null) {
            thread = new Thread() {
                @Override
                public void run() {
                    flag = true;
                    System.out.println("Watches launched!");
                    
                    while(flag) {
                        try {
                            thread.sleep(getDelay());
                            increaseTime();
                        } catch (InterruptedException e) {
                            flag = false;
                        } catch (Exception ex) {
                            System.err.println("Ouch!!!");
                        }
                    }
                }
            };
        }
        
        thread.start();
    }

    @Override
    public void stop() {
        if (thread != null) {
            thread.interrupt();
            thread = null;
            System.out.println("Watches stopped!");
        }
    }

    @Override
    public int getDelay() {
        return 1000 * 60;
    }

    @Override
    public void addEvent(IWatchesEventListener event) {
        events.addListener(event);
    }

    @Override
    public void removeEvent(IWatchesEventListener event) {
        events.removeListener(event);
    }
}
