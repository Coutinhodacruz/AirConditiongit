package XmasSnacks;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int product = 0;
        double price = 0;


        int quantity;
        String done = "y";
        double total;

        System.out.println("Enter value (1-5) or -0 to Quit");
        int value = input.nextInt();
        while (product == 0) {
            price = price + product;
            while (done.equals("y")) {
                System.out.println("Enter product Number: ");
                product = input.nextInt();
                System.out.println("Enter how many were sold: ");
                quantity = input.nextInt();


//                while (price == 0)

                price = switch (product) {
                    case 1 -> 2.98;
                    case 2 -> 4.50;
                    case 3 -> 9.98;
                    case 4 -> 4.49;
                    case 5 -> 6.87;
                    default -> price;
                };

                total = price * quantity;
                System.out.printf("Your total sale is: $%.2f\n", total);
                done = input.nextLine();


//                System.out.println("Would you like to enter another sale? (yes/no):");
//                input.nextInt();
//







            }
        }
    }

}