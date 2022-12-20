package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class quiz {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));
        System.out.println(names);
        names.remove("Ahmed");
        names.remove("Ahmed");
        System.out.println(names);

        System.out.println("???????????????????????");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(numbers);
        numbers.addAll(numbers);
        System.out.println(numbers);
        System.out.println("??????????????????????????");

        ArrayList<Integer> no = new ArrayList<>();
        no.addAll(Arrays.asList(1, 2, 3, 4, 5));
        no.set(no.size() - 1, 0);
        System.out.println(no);
        System.out.println("??????????????????????????");

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        ArrayList<String> list = new ArrayList<>();
        for (String each : arr1) {
            list.add(each);
        }
        for (String each : arr2) {
            list.add(each);
        }
        System.out.println(list);
    }
}

/*
write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,0];
Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];
 */