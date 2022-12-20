package Day08TernaryOperators;

public class BiggerNumber {
    public static void main(String[] args) {
                int n1 = 3;
                int n2 = 4;
                int n3 = 10;

                String biggerNum = n1>n2 && n1>n3?"n1 is bigger":n2>n1 && n2>n3?"n2 is bigger"
                        :n3>n1 && n3>n2?"n3 is bigger":"n4 is bigger";
                System.out.println(biggerNum);
            }
        }


