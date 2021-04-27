/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_01.watches;

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
    public void addSeconds(int seconds) throws Exception {
        this.hours = (this.hours + seconds / 3600) % 12;
        this.minutes = (this.minutes + (seconds % 3600) / 60) % 60;
        this.seconds = (this.seconds + seconds) % 60;
    }
        
    @Override
    public int getSeconds() throws Exception {
        return seconds;
    }
    
    @Override
    public String toString() {
       return hours + ":" + minutes + ":" + seconds;
    }
}
