import java.util.Scanner;

class SalariedPlusCommission extends Employee {
    private double baseSalary;
    private double weeklySales;
    private double commissionRate;

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

        System.out.print("Salary Pay Amount ==> ");
        baseSalary = input.nextDouble();

        System.out.println("Sales for this Past Week ==> ");
        weeklySales = input.nextDouble();

        System.out.println("Sales Commission Rate ==> ");
        commissionRate = input.nextDouble();

        input.nextLine();    // consumes newline
    }

    @Override
    public double getEarnings() {
        return baseSalary + (weeklySales * commissionRate);
    }
}
