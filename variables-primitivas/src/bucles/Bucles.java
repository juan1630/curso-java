package bucles;

public class Bucles {
    public static void main(String[] args) {

        final  int MAX_COUNT = 5;
        // Tiene una cantidad de ejecuciones determinadas
        for (int currentNumber = 1; currentNumber<=MAX_COUNT; currentNumber++) {
            System.out.println("currentNumber = " + currentNumber );
        }

        int counter = 1;
        int acumulador = 0;

        /*
        while (counter < 5){
            System.out.println("counter = " + counter);
            counter++;
            acumulador= acumulador+counter;
        }
        System.out.println("acumulador = " + acumulador);
        System.out.println("Sale");

         */

        int counter2 = 30;
        do{
            //Siepre se ejecuta la primera vez el ciclo
            System.out.println("Counter 2: " + counter2  );
            counter2++;
        }while (counter2 < 5);

    }
}
