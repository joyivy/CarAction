package Day07IFMultiBranch;

public class MultiBranchIf {

    public static void main(String[] args) {

        int numb = 100;
        String result = "";
        if (numb > 0) {
            result = "Positive"; //true
        }
        if (numb < 0) {
            result = "Negative";
        }
        if (numb == 0) {
            result = "Zero";
        }
        System.out.println(result);

        System.out.println("+++++++++++++++");

        String result2 = "";
        if (numb > 0) {
result2 = " Positive";
        } else if (numb < 0) {
            result2 = " Negatif";
        } else {
            result2 = "Zero";
        }
        System.out.println(result2);
    }
}