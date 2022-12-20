package Day07IFMultiBranch;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int number = 75;
        String crew = "";
        String passengers = "";
        String total;

        if (number == 50 || number == 75 || number == 100) {
            if (number == 50) {
                crew = "20";
                passengers = "30";
                total = crew + " crew, " + passengers + " passengers";
            } else if (number == 75) {
                crew = "25";
                passengers = "50";
                total = crew + " crew, " + passengers + " passengers";
            } else {
                crew = "30";
                passengers = "70";
                total = crew + " crew, " + passengers + " passengers";
            }
        }else{
            total = " Any other number of people on the ship is not valid";
        }   System.out.println(total);
    }
}







/*
Create a class called CrewAndPassenger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */