package scanner;

import java.util.Scanner;

public class NumberComver{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int firstNumber  =  getNumber(scanner, "Ingresa el primero numero");

       int secondNumber = getNumber(scanner, "Ingresa el segudo numero");
        printAritmethicOperations(firstNumber, secondNumber);
        compareNumber(firstNumber, secondNumber);
        System.out.println("Fin de la aplicación");
        scanner.close();
    }

    public static  int getNumber (Scanner scanner, String message) {
        System.out.println(message);
        int number  = scanner.nextInt();
        return number;
    }

    public  static  void printAritmethicOperations(int firstNumber, int secondNumber) {
        System.out.println("La suma de a + b es igual a:" + (firstNumber + secondNumber));
        System.out.println("La diferencia  de a - b es igual a:" + ( firstNumber - secondNumber ));
    }

    public static void compareNumber (int firstNumber, int secondNumber) {
        if(firstNumber> secondNumber){
            System.out.println("El primer número es mayor");
        }else {
            System.out.println("El segundo número es mayor ");
        }
    }
}
