/*
@name: Natan Souza and Gabriel Jucá
@date: 8th Sep 2021
Month.java
 */
package algorithmsandconstructs.enums;

/**
 * THIS IS SOME LEGACY CODE THAT IS PART OF THE SYSTEM AND YOU HAVE TO USE IT.
 *
 * @author apont
 */
public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int numberOfDays;

    Month(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

}
