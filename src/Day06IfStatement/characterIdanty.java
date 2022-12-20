package Day06IfStatement;

public class characterIdanty {
    public static void main(String[] args) {
        char specialCharacter = '$';
        char alphabeticCharacter = 'c';
        char digit = 48;

        if (specialCharacter >= 33 && specialCharacter <= 47 || specialCharacter >= 58 && specialCharacter <= 64
                || specialCharacter >= 91 && specialCharacter <= 96 || specialCharacter >= 123 && specialCharacter <= 126) {
            System.out.println("Special Character");
        }
        if (alphabeticCharacter >= 65 && alphabeticCharacter <= 90 ||
                alphabeticCharacter >= 97 && alphabeticCharacter <= 122) {
            System.out.println("Alphabetic Character");
        }
        if (digit >= 48 && digit <= 57) {
            System.out.println("Digit");
        }
    }
}
/*
5. Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */