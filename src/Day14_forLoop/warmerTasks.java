package Day14_forLoop;

public class warmerTasks {


    public static void main(String[] args) {

        String str3 =combine("one", "eight");
        System.out.println(str3);

        System.out.println( sumOf2IntegerNumbers(10,20));

        System.out.println(sumOf3IntegerNumbers(10,20,30));
        System.out.println(sumOf4IntegerNumbers(10,20,30,40));
    }
 //                                       one,  eight
    public static String combine (String str1, String str2){
        String result;
        if ( str1.endsWith("" + str2.charAt(0)) ){ //birinci kelime ikinci kelime ile ayni harfle basliyorsa
            result = str1+ str2.substring(1);
        }else{
            result= str1 + str2;
        }

        return result;

    }


    public static int sumOf2IntegerNumbers (int n1, int n2){
        return n1+n2;
    }
    public static int sumOf3IntegerNumbers (int n1, int n2, int n3){

        return sumOf2IntegerNumbers(n1, n2)+ n3;
    }
    public static int sumOf4IntegerNumbers(int n1, int n2, int n3, int n4){
       // return n1+n2+n3+n4;
        return sumOf3IntegerNumbers(n1, n2, n3) + n4;
    }
}
