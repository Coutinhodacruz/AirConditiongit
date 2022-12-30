package XmasSnacks;


import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] EmployeeNames = {" ", " ", " "};
        double HoursWorked = 0;
        double hourlyRate;
        double gross;
        int numberOfHours = 0;

        System.out.println("Welcome to the Salary Calculator.\n");
        System.out.println("Please enter:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Employee" + (i + 1) + " Name: ");
            EmployeeNames[i] = scanner.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(EmployeeNames[i] + "'s hours worked: ");
            HoursWorked = scanner.nextInt();
        }

        System.out.println("hourlyRate:");
        hourlyRate = scanner.nextDouble();
        for (int i = 0; i < 3; i++) {
            if (HoursWorked > hourlyRate && hourlyRate <= 40) {
                gross = HoursWorked * hourlyRate;
                gross = (numberOfHours / HoursWorked) * hourlyRate;
                System.out.printf("The gross pay for " + EmployeeNames[i] + " is: $%.2f\n", hourlyRate);
            }
        }

    }

}

























//while (true) {
//        System.out.println("Name(empty - Exit):");
//        String name = in.nextLine();
//        if(name.length()==0){
//        break;
//        }
//        System.out.println("Hours");
//        int hours = Integer.parseInt(in.nextLine());
//        System.out.println("Rate:");
//        double rate = Double.parseDouble(in.nextLine());
//        System.out.println(name + " Gross: " + (hours <= 40 ? rate * hours : (rate * 40) + (rate * (hours - 40) * 1.5)));



