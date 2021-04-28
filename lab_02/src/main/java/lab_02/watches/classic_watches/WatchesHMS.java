/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_02.watches.classic_watches;

/**
 *
 * @author AlibekovMurad5202
 */
public class WatchesHMS extends WatchesHM {
    protected int seconds = 0;

    public WatchesHMS(String brand, double price) {
        super(brand, price);
    }
    
    @Override
    public void setSeconds(int seconds) throws Exception {
        if ((seconds < 0) || (seconds > 59)) {
            throw new Exception("Invalid value of seconds");
        }
        this.seconds = seconds;
    }
        
    @Override
    public int getSeconds() throws Exception {
        return seconds;
    }
    
    @Override
    public String toString() {
       return hours + ":" + minutes + ":" + seconds;
    }
    
    @Override
    public void increaseTime() throws Exception {
        this.addSeconds(1);
        events.update(this);
    }
    
    protected void addSeconds(int seconds) {
        this.hours = (this.hours + seconds / 3600) % 12;
        this.minutes = (this.minutes + (seconds % 3600) / 60) % 60;
        this.seconds = (this.seconds + seconds) % 60;
    }
}
