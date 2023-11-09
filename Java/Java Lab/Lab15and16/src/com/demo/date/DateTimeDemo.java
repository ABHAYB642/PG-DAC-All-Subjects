package com.demo.date;
import java.sql.Time;
import java.util.*;

public class DateTimeDemo {
    public static void main(String[] args) {
        
        // Create a Date object
        Date today = new Date();
        System.out.println("Today's date is: " + today);
        
        // Create a Time object
        Time currentTime = new Time(System.currentTimeMillis());
        System.out.println("The current time is: " + currentTime);
        
        // Create a Calendar object
        Calendar cal = Calendar.getInstance();
        System.out.println("The current date and time using Calendar is: " + cal.getTime());
        
        // Manipulate the Calendar object
        cal.add(Calendar.DAY_OF_YEAR, 7);
        System.out.println("The date after adding 7 days to Calendar is: " + cal.getTime());
        cal.add(Calendar.MONTH, -2);
        System.out.println("The date after subtracting 2 months from Calendar is: " + cal.getTime());
    }
} 
