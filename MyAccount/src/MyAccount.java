public class MyAccount {
    private double accountBalance;
    private String firstName;
    private String lastName;


    public void setName(String firstName ,String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
        }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void deposit (double cash) {
      accountBalance += cash;
      if (cash <= 0) {
          System.out.println("invalid deposit amount");
      }
      else {
          accountBalance += cash;
      }
    }
    public void withdraw(double cash){
      accountBalance -= cash;

    }
    public double getBalance() {

        return accountBalance;
    }







}


