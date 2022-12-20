package WednsdayLessons;

public class week04If {

    public static void main(String[] args) {
        int N= 14;
        String result = "";//empty bucket that will hold whatever comes out of our logic

        /*if (N%2==0&& N%3==0&& N%5==0){ // checking if number is divisible 2,3,5

            result+= "CodiltyTestCoders";
        }else if(N%2==0&& N%3==0){
            result="CodiltyTest";
        }else if (N%3==0&& N%5==0){
            result = "TestCoders";
        } else if (N%2==0&&N%5==0) {
            result="CodilityTest";
        }
        System.out.println(result);

         */


//if condinitiun like doors

        if (N%2==0){
            result += "Codility";
        }
        if (N%3==0){
            result+= "Test";
        }

        if (N%5==0){
            result += " Coders";
        }


        System.out.println("result = " + result);
    }

}
