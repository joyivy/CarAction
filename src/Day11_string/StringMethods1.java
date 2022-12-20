package Day11_string;

public class StringMethods1 {

    public static void main(String[] args) {
        String str1 ="CYDEO SCHOOL";
        str1 = str1.toLowerCase();

        System.out.println(str1);

        System.out.println("///////////////////////////");

        String str2 = ("java programming");
        str2 = str2.toUpperCase();

        System.out.println(str2);
        System.out.println("/////////////////////////////////");

        String word = "Wooden Spoon";
        word= word.toUpperCase();
       word= word.toLowerCase();
        System.out.println(word);

        System.out.println(".............................");
        String strt4 = "                Cydeo Scholl               ";
       strt4= strt4.trim();
        System.out.println(strt4);
        System.out.println("::::::::::::::::::::::::::::");

        String sentence1 = " Today is Sunday, an we have Java Class";
       int index1= sentence1.indexOf('w');
        System.out.println(index1);
        String s1 = "I love Java Programming";
        int firstA = s1.indexOf('a');
        System.out.println(firstA);

        int secondA =s1.indexOf("a ");

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String s2 =" Java Python JavaScript Cydeo Python";

        int a1 =s2.indexOf('a');
        System.out.println(a1);

        int a2 = s2.indexOf ( "a Python");
        System.out.println(a2);

        int a3 = s2.indexOf("avaS");
        System.out.println(a3);

        System.out.println("######################");

        String  w ="Java";
        System.out.println(w.indexOf('a'));
        System.out.println(w.lastIndexOf('a'));

        String w2 ="Java Python JavaScript Cydeo Python ";

        System.out.println(w2.lastIndexOf('a'));
        System.out.println(w2.lastIndexOf('P'));



       ;
    }
}
