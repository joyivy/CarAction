package Day09_scanner;

import java.util.Scanner;

public class daysinweek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the day number:");
        //new Scanner ( System.in).nextInt();
        int num = input.nextInt();
        String day ="Invalid";
        if(num>=1&& num <=7){
            day =(num==1)? "Monday" :( num==2)? " Tuesday" :( num==3)? "Wendsday" :(num==4)?
"Thursday" :(num==5)? "Friday" :( num==6)? " Saturday" :"Sunday";
        }
        System.out.println(day);

        input.close();
    }
}
