package Day08TernaryOperators;

public class Elavator {
    public static void main(String[] args) {
        int floorNumber = 5;

        if (floorNumber >= 1 && floorNumber <= 3) {
            if (floorNumber == 1) {
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            } else if (floorNumber == 2) {
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            } else {
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }
        } else {
            System.out.println("Invalid floor");
        }
        System.out.println(floorNumber);
    }

    }

/*
/*
        if(floorNumber >= 1 && floorNumber <= 3){
            if(floorNumber == 1){
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            }else if(floorNumber == 2){
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            }else{
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }
        }else{
            System.out.println("Invalid floor");
        }
*/
