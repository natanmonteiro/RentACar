/*
@name: Natan Souza and Gabriel Jucá
@date: 8th Sep 2021
Car.java
 */
package algorithmsandconstructs;

import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;
import java.util.HashMap;
import java.util.Map;

//CarInterface is an abstract class and needs a "main" class that will implement its methods and attributes 
public class Car implements CarInterface{
    
    //Atrributes of the class Car. A car has a make, a daily rate, and ID and a calendar of availability
    public Make makeCar;
    public double dailyRate;
    public int id;
    public Map<Month, boolean[]> calendarOfAvailability = new HashMap();

    @Override
    public Map<Month, boolean[]> createAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Getter method that returns Make
    @Override
    public Make getMake() {
        return makeCar;
    }
    
    //Setter method that change Make
    @Override
    public void setMake(Make make) {
        this.makeCar = make;
    }
    
    //Getter method that returns dailyRate
    @Override
    public double getRate() {
        return dailyRate;
    }
    
    //Setter method that changes dailyRate
    @Override
    public void setRate(double rate) {
        this.dailyRate = rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
