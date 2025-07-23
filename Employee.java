import java.util.Calendar;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Constants to avoid magic numbers/hard coded
interface PayrollConstants { 
    double MAX_PAYCHECK = 1000.00;
    double BONUS_AMOUNT = 100.00;
    int OVERTIME_THRESHOLD = 40;
    double OVERTIME_RATE = 1.5;
}
abstract class Employee implements PayrollConstants {
    // instance variables
    protected String name;
    protected String socialSecurity;
    protected int birthMonth;
    protected int birthdayWeek;
    protected double paycheck;

    public abstract void load(Scanner input);   // prompts user for instance-variable values
    public abstract double getEarnings();

    // getBonus method
    public double getBonus() {
        Calendar current = Calendar.getInstance();
        int currentMonth = current.get(Calendar.MONTH) + 1;     // Added 1 to follow the 1-12 indexing; The default is from 0-index
        int currentWeek = current.get(Calendar.WEEK_OF_MONTH);
        if (birthMonth == currentMonth && birthdayWeek == currentWeek) {
        return BONUS_AMOUNT;    // if employee's birth month and birthweek matches current month and week, add BONUS_AMOUNT = $100
        } else {
        return  0.0;
        }
    }

    public void calculatePaycheck() {
        paycheck = getEarnings() + getBonus();
        if (paycheck > MAX_PAYCHECK) paycheck = MAX_PAYCHECK;
    }

    /*  Format Specifier Syntax: %

        %s      → String placeholder
        %d      → Integer placeholder
        %f      → Floating-point placeholder

        \n      → Newline character

        %.2f    → Floating-point with 2 digits after the decimal point
                    - .2 is the precision specifier
                    - Only applicable to %f

   Notes:
   - The `%` symbol introduces a format specifier.
   - Precision (e.g., .2) controls the number of digits after the decimal for floats.
   - You can combine text and format specifiers in a single string.
   - Commonly used in functions like printf (C), System.out.printf (Java), and string formatting in Python.
    */
    @Override
    public String toString() {      
        return String.format("Employee: %s\nSocial Security Number: %s\nPaycheck: $%.2f\n", name, socialSecurity, paycheck);
    }   // returns a String;      Employee's name, Social Security Number, Paycheck
}
