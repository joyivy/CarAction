package Day24_dayAndTime;

import java.util.Arrays;
import java.util.Collections;

public class frequancyOfCharacters {
    public static void main(String[] args) {


        String str = "aaabbbbccccc";

        String result = "";    //a3b4c5

        for (String each : str.split("")) {

            int frequency = Collections.frequency(  Arrays.asList( str.split("") )   , each );

            if(!result.contains(each)){
                result += each + frequency;
            }

        }


        System.out.println(result);

    }

    }
