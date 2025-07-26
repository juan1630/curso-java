package finalProject;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean repeat;

        do{
            System.out.print("Ingresa la edad: " );
            int age = scanner.nextInt();

            System.out.print("Ingresa tres calificaciones" );
            int firstGrade = scanner.nextInt();
            int secondGrade = scanner.nextInt();
            int thirdGrade = scanner.nextInt();

            int sum  = firstGrade + secondGrade +thirdGrade;
            double average = sum/3;


            System.out.println("sum = " + sum);
            System.out.println("average = " + average);

            if(average >= 6) {
                System.out.println("Aprobado y tu edad es : " + age);
            }else {
                System.out.println("Desaprobado y tu eddad es: " + age);
            }

            System.out.println("Desead ingresar más datos (1 Sí, 2 NO)");
            int option = scanner.nextInt();
            repeat = option ==1;

        }while (repeat);
        System.out.println("Fin del programa");
        scanner.close();
    }
}
