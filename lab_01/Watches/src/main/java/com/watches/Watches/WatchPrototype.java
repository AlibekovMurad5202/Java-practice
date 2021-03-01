package com.watches.Watches;

/**
 *
 * @author murad
 */
public abstract class WatchPrototype {
    protected String brand;
    protected double price;
    
    public WatchPrototype(String _brand, double _price) {
        this.brand = _brand;
        this.price = _price;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public double getPrice() {
        return price;
    }
}