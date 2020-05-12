package day38_Constructors;
/*
    Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double
                salaryAftertax(): retuns the salary after tax as double
                stateTax(): retuns the total state tax as double
                federalTax(): retuns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */
public class SalaryCalculator {

double hourlyRate;
int weeklyHours;
double stateTax;
double federalTax;

public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTax, double federalTax){

    this.hourlyRate =hourlyRate;
    this.weeklyHours =weeklyHours;
    this.stateTax = stateTax;
    this.federalTax =federalTax;

}

public double salary(){
    return hourlyRate*weeklyHours*48;
}

public double salaryAfterTax(){
    return salary()-(salary()*stateTax+salary()*federalTax);
}

public double stateTax(){
    return salary()*stateTax;
}

public double federalTax(){
    return salary()*federalTax;
}

    @Override
    public String toString() {
        return "Hourly rate: "+ hourlyRate+" | Weekly hours: "+ weeklyHours+" | Salary: $"+salary();
    }
}
