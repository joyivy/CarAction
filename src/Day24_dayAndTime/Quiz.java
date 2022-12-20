package Day24_dayAndTime;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Quiz {
    public static void main(String[] args) {
        ArrayList<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        list2.removeIf(p -> Collections.frequency(list2, p) > 1);
        System.out.println(list2);



    }
}
/*
 Write a program that can display the unique elements of an arrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]
 */
