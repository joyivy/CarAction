package day25_Constructor;

public class ConstructorIntro {

    public ConstructorIntro(){
        System.out.println("Objest is created by using int argument constructor");
    }

    public ConstructorIntro(int a){
        System.out.println("Objest is created by using int argument ");

    }

    public  void method(){

    }

    public static void main(String[] args) {

        ConstructorIntro obj =new ConstructorIntro(10);
        ConstructorIntro obj1 =new ConstructorIntro(10);
        ConstructorIntro obj2 =new ConstructorIntro(10);




    }
}
