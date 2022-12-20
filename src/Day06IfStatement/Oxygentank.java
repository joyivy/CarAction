package Day06IfStatement;

public class Oxygentank {
    public static void main(String[] args) {


            int oxygenLevel = 100;
            String result = "";

            if (oxygenLevel >= 90 && oxygenLevel <= 100){
                result = "Your tanks is full";
            }

            if (oxygenLevel >= 80 && oxygenLevel < 90){
                result = "Still okay";
            }
            if (oxygenLevel >= 70 && oxygenLevel < 80){
                result = "Don't go too far";
            }
            if (oxygenLevel >= 60 && oxygenLevel < 70){
                result = "Start to head back";
            }
            if (oxygenLevel >= 50 && oxygenLevel < 60){
                result = "Be careful now you are at % 50";
            }

            System.out.println(result);
    }
}
