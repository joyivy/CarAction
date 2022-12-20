package day20_forEach;

import java.util.Arrays;

public class arrayUtilityMethod {
    public static void main(String[] args) {
// ToString Method

        int []score ={70,100,80,90,65};
        System.out.println(Arrays.toString(score));
        String result = Arrays.toString(score);

        System.out.println(result);

        System.out.println("???????????????????????????");


        //Equal method

        int[] a1 ={1,2,3,4,5};
        int[] a2 ={1,2,3,4,5};
        boolean r1= Arrays.equals(a1,a2);
        System.out.println(r1); //get true because order and element are same.

        char[] ch1 ={'a','b','c'};
        char[] ch2={'a','c','b'};
        boolean ch3 = Arrays.equals(ch1, ch2);
        System.out.println(ch3);// get false because element same but not same order

        String[] s1 = {"A", "B", "C"};
        String[] s2 ={"A", "B", "C"};
        System.out.println(Arrays.equals(s1,s2));

        System.out.println("**************************************");

        //Sort method  make it order

        int [] nums ={100,7484743,2937,4757,3636,37373,26,2726,2820};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number= " + nums[0]);
        System.out.println("Maximim number= " + nums[nums.length-1]);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        String[] b1={"A", "B", "C"};
        String[] b2={"A", "C", "B"};

        Arrays.sort(b1);
        Arrays.sort(b2);

        System.out.println(Arrays.equals(b1,b2));

        //multipple character
        String [] students ={ "Yaxier", "Madivar", "Ali","Abidullah", "Alena"};
        System.out.println(Arrays.toString(students));

       Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("//////////////////////////////////////");

        //copyof method

        int[] array ={10,20,30,40,50,60,70};
        int [] array2= Arrays.copyOf(array, 7);
        System.out.println(Arrays.toString(array2));

        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");

        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};
        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length );
        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j]= n2[i];
        }



        System.out.println(Arrays.toString(n3));

        System.out.println("JJJJJJJJJJJJJJJJJJJJ");

        //copyOfrange = for copy

        char[] ch = {'A', 'B', 'C', 'D', 'F', 'G'};
        // index      0    1    2    3    4    5
        char[] result1 = Arrays.copyOf(ch,20);
        System.out.println(Arrays.toString(result1));

       char []result2 = Arrays.copyOfRange(ch, 2,6);
        System.out.println(Arrays.toString(result2));

        char[]result3 =Arrays.copyOfRange(ch,2, ch.length);



    }
}
