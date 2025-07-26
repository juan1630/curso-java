package BankAccount;

import java.util.Scanner;

public class BankAp {

    private BankAccountC account;
    private Scanner scanner;


    public BankAp(BankAccountC account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option;
        do {
            displayMenu();
            option = scanner.nextInt();
            processOption(option);
        }while(option != 4);
    }

    private void displayMenu() {
        System.out.println("Selecciona opciones");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Mostrar saldo");
        System.out.println("4. Salir");
    }

    private int getUserOption() {
        return scanner.nextInt();
    }

    private void handleDeposit() {
        System.out.println("Ingresa un monto a depositar: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
    }

    private void handlewithdraw() {
        System.out.println("Ingresa un monto a retirar: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }

    private void processOption(int option) {
        switch (option) {
            case 1: {
                handleDeposit();
                break;
            }
            case 2: {
                handlewithdraw();
                break;
            }
            case 3: {
                account.displayBalance();
                break;
            }
            case 4: {
                System.out.println("Saliendo...");
            }
            default: {
                System.out.println("Opción incorrecta");
                break;
            }
        }
    }
}
