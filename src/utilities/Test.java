package utilities;


import day27_AccessModifiers.AccessModifiers;
import day27_AccessModifiers.Data;

public class Test {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();
        System.out.println("______________________");

       // System.out.println(AccessModifiers.publicDate);// public always accesible different packeges.
       // System.out.println(AccessModifiers.protectedData); protected  not always unaccesible different packeges.
        // System.out.println(AccessModifiers.defaultDate); default  is not be accesiible in diffirent packeges
        //System.out.println(AccessModifiers.privateData);//privite not accesible within same package




    }

}