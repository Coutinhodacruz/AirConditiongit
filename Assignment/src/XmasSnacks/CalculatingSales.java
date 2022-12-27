package XmasSnacks;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int product;
        double price = 0;
//        int product1;
//        int product2;
//        int product3;
//        int product4;
//        int product5;

        int quantity;
        String done = "y";
        double total = 0;
        int itemCounter = 0;

        System.out.println("Enter value (1-5) or -0 to Quit");
        int value = input.nextInt();
        while (value != 0) {
            if (value == 1) {
                double amount = 239.99;
            }
            while (done.equals("y")) {
                System.out.println("Enter product Number: ");
                product = input.nextInt();
                System.out.println("Enter how many were sold: ");
                quantity = input.nextInt();

                while (price == 0)
                    switch (product) {
                        case 1:
                            price = 2.98;
                            break;

                        case 2:
                            price = 4.50;
                            break;

                        case 3:
                            price = 9.98;
                            break;

                        case 4:
                            price = 4.49;
                            break;

                        case 5:
                            price = 6.87;
                            break;
                    }

                total = price * quantity;
                System.out.printf("Your total sale is: $%.2f", total);

                System.out.println(": Would you like to enter another sale? (yes/no):");
                done = input.nextLine();



            }
        }
    }
}