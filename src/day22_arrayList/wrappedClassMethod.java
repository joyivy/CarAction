package day22_arrayList;

public class wrappedClassMethod {
    public static void main(String[] args) {


        String str ="20";
        System.out.println(str +1);

        int num1= Integer.parseInt(str);
        System.out.println(num1+1);
        Integer num2 = Integer.valueOf(str);
        System.out.println(num2);

        System.out.println("????????????????????????????????");
        String s="20.5";
        Double num3= Double.parseDouble(s);
        Double num4= Double.valueOf(s);
        System.out.println(num3);
        System.out.println(num4);

        System.out.println("????????????????????????????????");

        String x ="true";
        boolean r1 = Boolean.parseBoolean(x);
        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("????????????????????????????????");

        char ch ='Z';
        boolean isDigit = Character.isDigit(ch);
        boolean isLater = Character.isLetter(ch);
        boolean isLoweCaseletter = Character.isLowerCase(ch);
        boolean isUpperCaseletter = Character.isUpperCase(ch);
        boolean IsSpecialCharacter = Character.isLetterOrDigit(ch);

        System.out.println("isDigit?= " + isDigit);
        System.out.println("isDigit?= " + isLater);
        System.out.println("isDigit?= " + isLoweCaseletter);
        System.out.println("isDigit?= " + IsSpecialCharacter);

        System.out.println("???????????????????????????????????????????");

        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) {

            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }

        }


        System.out.println("sum = " + sum);







    }

}

