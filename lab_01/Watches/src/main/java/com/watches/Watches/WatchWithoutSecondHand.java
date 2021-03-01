package com.watches.Watches;

/**
 *
 * @author murad
 */
public class WatchWithoutSecondHand extends WatchPrototype {
    protected int hours;
    protected int minutes;
    
    public WatchWithoutSecondHand(String _brand, double _price) {
        super(_brand, _price);
        this.hours = 0;
        this.minutes = 0;
    }
    
    public void setTime(int _hours, int _minutes) throws Exception {
        if ((_hours < 0) || (_hours > 11)) {
            throw new Exception("Invalid value of hours");
        }
        if ((_minutes < 0) || (_minutes > 59)) {
            throw new Exception("Invalid value of minutes");
        }
        this.hours = _hours;
        this.minutes = _minutes;
    }
    
    public void addTime(int _hours, int _minutes) {
        this.hours = (this.hours + _hours) % 12;
        this.minutes = (this.minutes + _minutes) % 60;
    }
    
    public int getHours() {
        return hours;
    }
    
    public int getMinutes() {
        return minutes;
    }
}
