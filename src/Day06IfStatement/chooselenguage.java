package Day06IfStatement;

public class chooselenguage {
    public static void main(String[] args) {
        int lang = 3;
        if (lang == 1) {
            System.out.println(" Hello, thank for your call ");
        }
        if (lang == 2) {
            System.out.println(" Hola, gracias para llamar ");
        }
        if (lang == 3) {
            System.out.println(" Merhaba, aradiginiz icin tesekkurler ");
        }
        if (lang == 4) {
            System.out.println(" Privet, spasibo za vash zvonok ");
        }
        if (lang == 5) {
            System.out.println(" Merci ,pour votre appel ");
    }
        System.out.println("+++++++++++++++++++++++++++++++++=");

        int selection = 3;
        String language = "";

        if(selection == 1){
            System.out.println(language + "Hello, thanks for your call");
        }
        if(selection == 2){
            System.out.println(language + "Hola, gracias para llamar");
        }
        if(selection == 3){
            System.out.println(language + "Merhaba, aradiginiz icin tesekkurler");
        }
        if(selection == 4){
            System.out.println(language + "Privet, spasibo za vash zvonok");
        }
        if(selection == 5){
            System.out.println(language + "Merci ,pour votre appel");
        }

    }
}


/*
4. Create a class named ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement


 */