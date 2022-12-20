package day16_NestedLoop;

public class FreequencyOfWord {
    public static void main(String[] args) {
        String sentence = " JaVa JAva jAvA jaVa";
        String word ="Java";

        sentence =sentence.toLowerCase();
        word=word.toLowerCase();
        int count = 0;

        while(sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst(word, "");
        }
        System.out.println(count);
    }
}
