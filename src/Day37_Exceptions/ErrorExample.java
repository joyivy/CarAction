package Day37_Exceptions;

import java.util.ArrayList;

public class ErrorExample {

    public static void main(String[] args) {
        ArrayList<Pizza> pizzas = new ArrayList<>();
        while(true){
           pizzas.add(new Pizza('s',2,3));
        }
    }
}
