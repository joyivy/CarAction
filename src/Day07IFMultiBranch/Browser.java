package Day07IFMultiBranch;

public class Browser {
    public static void main(String[] args) {
        String browser = "chrome";
        String result = "is selcted";

        if (browser == "chrome" || browser == "firefox" || browser == " opera"
        ||browser == "safari" || browser == "edge"){
            if(browser=="chrome"){
                result ="Chrome Browser" + "is selected";
            } else if (browser == "Firefox" + " is selected") {
                result ="Firefox";
            } else if ( browser == "opera" +"is selected"){
                result =" safari";
            }else if( browser == "edge" + " is selected"){

            }else{
                result ="Invalid Browser";
            }

            }
        System.out.println(result);
    }
}


  /*
  reate a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
   */