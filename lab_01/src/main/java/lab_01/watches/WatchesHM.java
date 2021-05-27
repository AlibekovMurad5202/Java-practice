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
public class WatchesHM implements IWatches {
    protected String brand;
    protected double price;
    protected int hours = 0;
    protected int minutes = 0;

    public WatchesHM(String brand, double price) {
        this.brand = brand;
        this.price = price;
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
    public void addHours(int hours) throws Exception {
        this.hours = (this.hours + hours) % 12;
    }

    @Override
    public void addMinutes(int minutes) throws Exception {
        this.hours = (this.hours + (this.minutes + minutes) / 60) % 12;
        this.minutes = (this.minutes + minutes) % 60;
    }

    @Override
    public void addSeconds(int seconds) throws Exception {
        throw new Exception("There are not second hands");
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
}
