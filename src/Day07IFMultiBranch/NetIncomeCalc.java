package Day07IFMultiBranch;

public class NetIncomeCalc {
    public static void main(String[] args) {
        int salary = 115000;
        boolean isMarried = false;
        double taxrate = 0;

        if (salary >= 130000) {
            taxrate = 0.35;
        }
        if (salary >= 10000 && salary < 129999) { //if salary between this is formula
            taxrate = 0.3;
        }
        if (salary >= 80000 && salary < 99999) {
            taxrate = 0.25;
        }
        if (salary < 80000) {
            taxrate = 0.2;
        }
        if(isMarried){
            taxrate -= 0.05;
        }

        double totalTax = salary * taxrate;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

    }
}
/*
3. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129,999k
                        25% for salary of 80K to 99,999K
                        20% for salary of 79K or less
                in addition:
                	if the person is married, he/she will pay 5% less tax
 */