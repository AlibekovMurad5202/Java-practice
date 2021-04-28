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
public interface IWatches {
    void setHours(int hours) throws Exception;
    void setMinutes(int minutes) throws Exception;
    void setSeconds(int seconds) throws Exception;
    
    String getBrand();
    double getPrice();
    int getHours();
    int getMinutes();
    int getSeconds() throws Exception;
    
    void increaseTime() throws Exception;
}
