package datesAndCalendar;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarNameProvider;


public class DatesAndCalendar {
    public static void main(String[] args) {
        DatesAndCalendar.displayCurrentDate();

    }

    // Method to display the current date
    private static void displayCurrentDate() {
        Calendar myCalendar = Calendar.getInstance();
        System.out.println(myCalendar);

        Date date = new java.util.Date();
        myCalendar.setTime(date);
        System.out.println(myCalendar.getTime());
    }

    private static void displaySetDate() {
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.set(2023, 02, 23);
        Date date = myCalendar.getTime();
        System.out.println(date);
    }
}
