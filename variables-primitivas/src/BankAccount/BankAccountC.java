package BankAccount;

public class BankAccountC {
    private String AccountHolder;
    private double balance;

    public BankAccountC(String accountHolder, double balance) {
        AccountHolder = accountHolder;
        this.balance = balance;
    }

    public  void deposit(double amount) {
        if(amount > 0) {
            //balance = balance +amount;
            balance += amount;
            System.out.println("Desposito exitoso" +  this.balance );
        }else {
            System.out.println("El monto ingresado no es correcto");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            //balance = balance - amount;
            balance =- amount;
        }else {
            System.out.println("Monto no valido");
        }
    }

    public void displayBalance() {
        System.out.println("Saldo: "  + balance);
    }
}
