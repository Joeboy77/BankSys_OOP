public class Main {

    public static void main(String[] args) {
        BankAccount Joe = new BankAccount("Joseph", "1032", 2);

        Joe.deposit(20);
        

        Joe.withdraw(20);
        System.out.println(Joe.getBalance());

        Joe.getAccountSummary();
    }
}