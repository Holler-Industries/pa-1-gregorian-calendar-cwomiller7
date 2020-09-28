package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();
        GregorianCalendar myCal2 = new GregorianCalendar(2004, Calendar.JUNE, 26);
        int dayOfMonth = myCal.get(Calendar.DAY_OF_MONTH);
        System.out.println("myCal Day of Month: " + dayOfMonth);
        System.out.println("Expected: 23");

        int month = myCal.get(Calendar.MONTH) +1;
        System.out.println("myCal Month: " + month);
        System.out.println("Expected: 9");

        int year = myCal.get(Calendar.YEAR);
        System.out.println("myCal Year: " + year);
        System.out.println("Expected: 2020");

        int weekday = myCal.get(Calendar.DAY_OF_WEEK);
        System.out.println("myCal Day of Week: " + weekday);
        System.out.println("Expected: 4");
        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument

             //Note: 1 = Sunday, 2 = Monday, etc.



        System.out.println("Today's date is:" + month + "/" + dayOfMonth + "/" + year);

        //Write similar tests for month, year and day of month.
        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html

        myCal.add(Calendar.DAY_OF_YEAR, 100);
        int weekday2 = myCal.get(Calendar.DAY_OF_WEEK);
        int month2 = myCal.get(Calendar.MONTH) +1;
        int dayOfMonth2 = myCal.get(Calendar.DAY_OF_MONTH);
        int year2 = myCal.get(Calendar.YEAR);
        System.out.println("100 days from today, the date will be:" + month2 + "/" + dayOfMonth2 + "/" + year2);


        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)

        int Bdayweekday = myCal2.get(Calendar.DAY_OF_MONTH);
        int Bdaymonth = myCal2.get(Calendar.MONTH)+1;
        int Bdayyear = myCal2.get(Calendar.YEAR);

        System.out.println("The weekday of my birthday is a " +  Bdayweekday);
        System.out.println("My Birthday is: " + Bdaymonth + "/" + Bdayweekday + "/" + Bdayyear);

        myCal2.add(Calendar.DAY_OF_YEAR, 10000);
        int Futurebday = myCal2.get(Calendar.MONTH) +1;
        System.out.println("10000 days after my date of birth, the date is: " + Futurebday + "/" + myCal2.get(Calendar.DAY_OF_MONTH) + "/" + myCal2.get(Calendar.YEAR));

    }

}