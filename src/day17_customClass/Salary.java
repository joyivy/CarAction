package day17_customClass;

public class Salary {
    /*public int hourlyRate;
    public double stateTaxRateate,
            fedaralTaxrate;
    public int weeklyHours;

    public void setInfo(int hourlyRate, double stateTaxRate, double fedaralTaxrate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.fedaralTaxrate = fedaralTaxrate;
        this.weeklyHours = weeklyHours;


    }

    public void salary() {
        double salary = hourlyRate * weeklyHours * 52;
        salary();
    }

    public double stateTax() {
        double stateTax = salary() * stateTaxRate / 100;
        return stateTax;

    }

}

/*
4. Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */

    public double hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        double s =hourlyRate*weeklyHours*52;
        return s;
    }
    public double stateTax(){
        double sT =salary()*stateTaxRate/100;
        return sT;
    }

    public double federalTax(){
        double fT = salary()*federalTaxRate/100;
        return fT;
    }
    public double salaryAfterTax(){
        double sATx  = salary() - stateTax() - federalTax();
        return sATx;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax()+
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }


}

