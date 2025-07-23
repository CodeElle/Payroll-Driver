import java.util.Scanner;

public class PayrollDriver {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Number of Employees: ");
            int count = input.nextInt();
            input.nextLine();   // consumes newline
            
            Employee[] employees = new Employee[count];
            
            for (int i = 0; i < count; i++) {
                System.out.printf("\nPROFILE FOR EMPLOYEE #%d:\n", i + 1);
                System.out.print("TYPE Hourly(1), Salaried(2), Salaried plus Commission(3)\nEnter 1, 2, or 3 ===> ");
                int type = input.nextInt();
                input.nextLine();   // consumes newline
                
                switch (type) {
                    case 1 -> employees[i] = new Hourly();
                    case 2 -> employees[i] = new Salaried();
                    case 3 -> employees[i] = new SalariedPlusCommission();
                    default -> {
                        System.out.println("Invalid type. Defaulting to Hourly.");
                        employees[i] = new Hourly();
                    }
                }
                
                employees[i].load(input);
                employees[i].calculatePaycheck();
            }
            
            System.out.println("\nPAYCHECK REPORT: \n");
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }
}
