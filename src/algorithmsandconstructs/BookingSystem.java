/*
@name: Natan Souza and Gabriel Jucá
@date: 22th Sep 2021
BookingSystem.java
 */
package algorithmsandconstructs;

import java.io.BufferedReader;
import java.io.IOException;

public class BookingSystem implements BookingSystemInterface {

    //This is the Booking System to generate the bookings
    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {

        //Declaring variables
        String cars = in.readLine();
        String content = "";

        RentACarInterface feed = new RentACar();
        
        //Loop to read line of feed
        while (cars != null) {
            System.out.println(cars);
            content = in.readLine();
            System.out.println(content);

           // Car item = new Car(makeCar, content);
          //  feed.addItem(item);

            cars = in.readLine();
        }

        return feed;

    }

}
