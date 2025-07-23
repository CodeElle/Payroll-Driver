import java.util.Scanner;

class Hourly extends Employee {
    // instance variables
    private double hourlyPay;
    private double hoursWorked;

    @Override
    // prompts user for instance-variable values
    public void load(Scanner input) {
        System.out.print("Enter Employee's Full Name ==> ");
        name = input.nextLine();

        System.out.println("Enter Social Security Number ==> ");
        socialSecurity = input.nextLine();

        System.out.println("Enter Birth Month (1-12000) ==> ");
        birthMonth = input.nextInt();

        System.out.println("Enter Birthday Bonus Week (1-4) ==> ");
        birthdayWeek = input.nextInt();

        System.out.println("Hourly Pay Amount ==> ");
        hourlyPay = input.nextDouble();

        System.out.print("Number of Hours Worked this Past Week ==> ");
        hoursWorked = input.nextDouble();
        
        input.nextLine();    // consumes newline
    }

    @Override
    // getEarnings method
    public double getEarnings() {
        if (hoursWorked <= OVERTIME_THRESHOLD) {
            return hourlyPay * hoursWorked; // regular pay for less than or equal to OVERTIME_THRESHOLD
        } else {
            double overtime = hoursWorked - OVERTIME_THRESHOLD; // if more than OVERTIME_THRESHOLD, minus the regular hoursWorked = overtime
            return (hourlyPay * OVERTIME_THRESHOLD) + (overtime * hourlyPay * OVERTIME_RATE);
        }
    }
}