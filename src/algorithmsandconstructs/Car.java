/*
@name: Natan Souza and Gabriel Jucá
@date: 22th Sep 2021
Car.java
 */
package algorithmsandconstructs;

import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;
import java.util.HashMap;
import java.util.Map;

//CarInterface is an abstract class and needs a "main" class that will implement its methods and attributes 
public class Car implements CarInterface{
    
    //Attributes of the class Car. A car has a make, a daily rate, and ID and a calendar of availability
    public Make makeCar;
    public double dailyRate;
    public int id;
    public Map<Month, boolean[]> calendarOfAvailability;
    
    //Method that creates the map of availability for the entire year based on the number of days of each month
    @Override
    public Map<Month, boolean[]> createAvailability() {
        
        calendarOfAvailability = new HashMap<>();
        
        calendarOfAvailability.put(Month.JANUARY, new boolean[Month.JANUARY.getNumberOfDays()]);
        calendarOfAvailability.put(Month.FEBRUARY, new boolean[Month.FEBRUARY.getNumberOfDays()]);
        calendarOfAvailability.put(Month.MARCH, new boolean[Month.MARCH.getNumberOfDays()]);
        calendarOfAvailability.put(Month.APRIL, new boolean[Month.APRIL.getNumberOfDays()]);
        calendarOfAvailability.put(Month.MAY, new boolean[Month.MAY.getNumberOfDays()]);
        calendarOfAvailability.put(Month.JUNE, new boolean[Month.JUNE.getNumberOfDays()]);
        calendarOfAvailability.put(Month.JULY, new boolean[Month.JULY.getNumberOfDays()]);
        calendarOfAvailability.put(Month.AUGUST, new boolean[Month.AUGUST.getNumberOfDays()]);
        calendarOfAvailability.put(Month.SEPTEMBER, new boolean[Month.SEPTEMBER.getNumberOfDays()]);
        calendarOfAvailability.put(Month.OCTOBER, new boolean[Month.OCTOBER.getNumberOfDays()]);
        calendarOfAvailability.put(Month.NOVEMBER, new boolean[Month.NOVEMBER.getNumberOfDays()]);
        calendarOfAvailability.put(Month.DECEMBER, new boolean[Month.DECEMBER.getNumberOfDays()]);
       
        return calendarOfAvailability;
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
    
    //Getter method that returns calendarOfAvailability
    @Override
    public Map<Month, boolean[]> getAvailability() {
        return calendarOfAvailability;
    }
    
    //Setter method that changes calendarOfAvailability
    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        this.calendarOfAvailability = availability;
    }
    
    //Getter method that returns id
    @Override
    public int getId() {
        return id;
    }
    
    //Method to check if the car is available
    @Override
    public boolean isAvailable(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    //Method to book a car
    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
}
