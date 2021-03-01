package com.watches.Watches;

/**
 *
 * @author murad
 */
public class WatchWithSecondHand extends WatchWithoutSecondHand {
    protected int seconds;
    
    public WatchWithSecondHand(String _brand, double _price) {
        super(_brand, _price);
        this.seconds = 0;
    }
    
    public void setTime(int _hours, int _minutes, int _seconds) throws Exception {
        if ((_seconds < 0) || (_seconds > 59)) {
            throw new Exception("Invalid value of _seconds");
        }
        setTime(_hours, _minutes);
        this.seconds = _seconds;
    }
    
    public void addTime(int _hours, int _minutes, int _seconds) {
        addTime(_hours, _minutes);
        this.seconds = (this.seconds + _seconds) % 60;
    }
    
    public int getSeconds() {
        return seconds;
    }
}