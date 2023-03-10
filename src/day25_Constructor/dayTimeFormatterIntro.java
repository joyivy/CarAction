package day25_Constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dayTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df= DateTimeFormatter.ofPattern("y/ MMMM/dd/EE");
        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        System.out.println("????????????????????????????????????????????");

        DateTimeFormatter tf =DateTimeFormatter.ofPattern("HH:mm a");
        LocalTime time1= LocalTime.of(7,5);
        System.out.println(time1.format(tf));


        DateTimeFormatter dtf =DateTimeFormatter.ofPattern( "EEEE MMM/dd/y  hh:mm a");
        LocalDateTime starts =LocalDateTime.now();
        System.out.println(starts.format(dtf));


    }
}
