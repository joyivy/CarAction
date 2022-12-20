package day23_ArrayList;

import java.util.ArrayList;

public class RemoveDublicates {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        System.out.println(names);

        ArrayList<String> nonDub = new ArrayList<>();
        for (String each : names) {
            if (nonDub.contains(each)) {
                continue;
            }
            nonDub.add(each);
        }
        names=nonDub;
        System.out.println(nonDub);
        System.out.println("????????????????????????????????????????????????");

    }
}
