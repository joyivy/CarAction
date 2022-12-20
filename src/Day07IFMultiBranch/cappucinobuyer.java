package Day07IFMultiBranch;

public class cappucinobuyer {
    public static void main(String[] args) {

        String size ="venti";
        String result ="price is ";

        if (size=="tall"||size=="grand"||  size=="venti"){
            if (size=="tall"){
                result +="$3.69\n90 calories";
            } else if (size=="grand") {
                result +="$3.99;\n120 calories";
            }else {
                result+="$4.29\n150 calories";
            }

        }else {
            result="invalid";
        }
        System.out.println(result);




        }

    }

/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if
 */