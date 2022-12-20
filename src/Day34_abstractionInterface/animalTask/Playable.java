package Day34_abstractionInterface.animalTask;

public interface Playable {

    boolean isFriendly= true; // static & final.


/*
    public static void main(String[] args) {
        System.out.println(isFriendly);
    }
    default  void method1(){

    }

 */

     void play(); //abstract
}
