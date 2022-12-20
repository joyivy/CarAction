package Day06IfStatement;

public interface NumberToWorld {
    public static void main(String[] args) {
        int number = 1;

        boolean one = number==1 || number==2 || number == 3 || number == 4 || number == 5 || number == 6 || number == 7 || number == 8 || number== 9;

        if (number == 1){
            System.out.println("One");
        }

    }
}
/*
2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement

 */