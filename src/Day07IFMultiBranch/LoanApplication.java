package Day07IFMultiBranch;

public class LoanApplication {

    public static void main(String[] args) {
        int salary = 3000;
        int creditScore = 800;

        if( salary >= 4500 && creditScore >= 700){
            System.out.println( "You are eligible for loan");
        }else{
            System.out.println(" You are not eligible for loan");
        }
        //also you get print String result = "" write statement same but nout sout, write result
    }
}
/*
1. Create a class named LoanApplication. two variables named salary and createdScore are declared and given,
write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700

 */