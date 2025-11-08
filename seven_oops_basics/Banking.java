package seven_oops_basics;

public class Banking {
    
    double currentBalance = 1000;

    public void greetCustomer() {
        System.out.println("==================================");
        System.out.println("Welcome To Bank");
        System.out.println("==================================");
    }

    public void depositAmount(double amount){
        currentBalance += amount;
        System.out.println("Amount Deposited: "+amount);
    }

    public void withdrawAmount(double amount){
        currentBalance -= amount;
        System.out.println("Amount Withdrawn: "+amount);
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public static void main(String[] args) {
        
        Banking customer = new Banking();
        customer.greetCustomer();

        // customer wants to check balance 
        System.out.println("Your Initial Balance: "+customer.getCurrentBalance());

        // deposit amount 1500
        customer.depositAmount(1500);

        // customer wants to check balance 
        System.out.println("Your Current Balance: "+customer.getCurrentBalance());

        // customer wants to withdraw
        customer.withdrawAmount(500);

        // customer wants to check balance 
        System.out.println("Your Current Balance: "+customer.getCurrentBalance());

    }

}
