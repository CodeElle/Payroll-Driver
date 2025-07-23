import java.util.Scanner;

class Salaried extends Employee {
    private double weeklySalary;

    @Override
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
        weeklySalary = input.nextDouble();

        input.nextLine();    // consumes newline
    }

    @Override
    public double getEarnings() {
        return weeklySalary;
    }
}