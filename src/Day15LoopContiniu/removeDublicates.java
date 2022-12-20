package Day15LoopContiniu;

public class removeDublicates {
    public static void main(String[] args) {
        String str = "shfdksdfjn;oisdfcm;oaldkmf;asnhflnv,mxvonfsmdfc.ndgm.";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains("" + each)) {
                result += each;
            }
        }
        System.out.println(result);
    }
}