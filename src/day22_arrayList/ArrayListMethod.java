package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        System.out.println(list);
        list.add(2,45);
        //System.out.println(list.size());

        System.out.println(list);
        list.add(1,87);
        System.out.println(list);

        System.out.println("??????????????????????/");

        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Mohammed");
        studentList.add("Abdurasu");
        studentList.add("Abidullah");
        studentList.add("Tatiana");

        System.out.println(studentList.size());
        System.out.println(studentList);

      String firstStudent = studentList.get(0);
      String laststudent= studentList.get( studentList.size()-1);
        System.out.println(firstStudent);
        System.out.println(laststudent);
    }
}
