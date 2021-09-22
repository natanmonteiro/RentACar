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
        String month = in.readLine();
        String day = "";

        RentACarInterface book = new RentACar();
        
        //Loop to read line of feed
        while (month != null) {
            System.out.println(month);
            day = in.readLine();
            System.out.println(day);

           // Car item = new Car(makeCar, content);
          //  feed.addItem(item);

            month = in.readLine();
        }

        return book;

    }

}
