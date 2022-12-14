import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyAccount account = new MyAccount();
        System.out.println("Enter firstName");
        String firstName =input.nextLine();
        System.out.println("Enter lastName");
        String lastName =input.nextLine();
        account.setName(firstName , lastName);
        account.deposit(10000);
        System.out.println("my account balance " + account.getBalance());

        account.withdraw(5000);
        System.out.println("my initial balance " + account.getBalance());











    }
}