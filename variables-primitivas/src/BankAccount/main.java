package BankAccount;

public class main {
    public static void main(String[] args) {
        BankAccountC bankAccount = new BankAccountC("José Patrón", 50000);
        BankAp bankAp = new BankAp(bankAccount);

        bankAp.start();
    }
}
