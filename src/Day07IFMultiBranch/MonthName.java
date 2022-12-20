package Day07IFMultiBranch;

import java.time.Month;

public class MonthName {
    public static void main(String[] args) {

        int n = 11;
        String month = "";
        if (n >= 1 && n<= 12){
            if (n==1) month = "January";
            if (n== 2) month = "Fabuary";
            if ( n==3) month = "March";
            if ( n==4) month = "April";
            if ( n==5) month = "May";
            if ( n==6) month = "Jun";
            if ( n==7) month = "July";
            if (n==8) month =" August";
            if (n==9) month= " Septemeber";
            if (n==10) month= " October";
            if (n==11) month= "November";
            else month = "December";
        }else{
            System.out.println("No such a month");
        }
        System.out.println(month);


    }
}
