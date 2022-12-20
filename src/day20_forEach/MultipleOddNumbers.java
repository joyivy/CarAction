package day20_forEach;

import java.util.Arrays;
import utilities.ArraysUtility;
public class MultipleOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                continue;
            }
            numbers[i] = numbers[i] * 2;
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("llllllllllll");

        int[] a1 = {10, 20, 20, 40, 50, 60};
        int[] a2 = {70, 80, 90};
        int[] a3 = ArraysUtility.merge(a1, a2);
        System.out.println(Arrays.toString(a3));

        System.out.println("???????????????????????????????????????");

        double[] d1 = {10.5, 5.5, 3.5, 6.5, 8, 5};
        double[] d2 = {20.5, 15.5, 13.5};
        double[] d3 = ArraysUtility.merge(d1, d2);

        System.out.println(Arrays.toString(d3));

        char[] ch1 = {'a', 'b', 'c', 'd'};
        char[] ch2 = {'e', 'f', 'g', 'h'};
        char[] ch3 = ArraysUtility.merge(ch1,ch2);
        System.out.println(Arrays.toString(ch3));
        System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");

        String[]c1 = { "java","javascript", "ruby", "Joy"};
        String[] c2={ "Belki de", "Bunlar", "Hep yalan"};
        String[]c3 = ArraysUtility.merge(c1,c2);
        System.out.println(Arrays.toString(c3));
    }
}