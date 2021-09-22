/*
@name: Natan Souza and Gabriel Jucá
@date: 8th Sep 2021
RentACar.java
 */
package algorithmsandconstructs;

import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;
import java.util.List;

//Implements RentACarInterface
public class RentACar implements RentACarInterface{
    //This are the attributes of the class
    private List<CarInterface> cars;
    private String name;
    private int numberOfCars;

    //Getter method for Cars
    @Override
    public List<CarInterface> getCars() {
        return this.cars;
    }

    //Setter method for Cars
    @Override
    public void setCars(List<CarInterface> cars) {
        this.cars = cars;
    }

    //Getter method for Name
    @Override
    public String getName() {
        return this.name;
    }

    //Setter method for Name
    @Override
    public void setName(String name) {
        this.name = name;
    }

    //Method to check the availability of the car
    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Method to get the ID of the car
    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Method to book a car
    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        if (checkAvailability(month, day, make, lengthOfRent) == false) {
            System.out.println("Car booked");
            return true;
        } else {
            System.out.println("Car not available");
            return true;
        }
    }

    //Getter method for Number of cars
    @Override
    public int getNumberOfCars() {
        return this.numberOfCars;
    }
    
}
