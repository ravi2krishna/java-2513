package eight_constructors;

public class Bank {
    
    // if you want to create a bank account in HDFC Bank 
    // Account can be opened, if minimum balance is 10000

    // Say we have few other banks, which can open an account with  
    // custom balance like 2000, 5000, 0 

    double minBalance;

    // HDFC Bank
    public Bank() {
        System.out.println("======= HDFC =======");
        System.out.println("Creating HDFC Account");
        minBalance = 10000;

        // hdfc charging some service charge(1500) when creating account 
        minBalance -= 1500;

    }

    // few other banks
    public Bank(double minBalance) {
        this.minBalance = minBalance;
    }

    public double showBalance() {
        return minBalance;
    }

    public static void main(String[] args) {
        
        Bank hdfcCustomer = new Bank();
        System.out.println("HDFC Balance: "+hdfcCustomer.showBalance());

        Bank grameenaBank = new Bank(2000);
        System.out.println("Grameena Bank Balance: "+grameenaBank.showBalance()); 
        
        Bank sbiBank = new Bank(0);
        System.out.println("SBI Bank Balance: "+sbiBank.showBalance()); 

    }

}
