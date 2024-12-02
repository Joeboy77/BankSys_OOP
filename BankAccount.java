public class BankAccount {
    
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    //Constructor
    public BankAccount(String accountHolderName, String accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance = balance + amount;
    }

    public double withdraw(double amount){
        if(amount > this.balance){
            System.out.println("Can't exceed amount");;
        } else {
            System.out.println("You have taken " + amount + " from " + this.balance);
            this.balance = balance - amount;
        }
        
        return amount;
        
    }

    public void getAccountSummary(){
        System.out.println("Name: " + getAccountHolderName());
        System.out.println("Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
    }

}
