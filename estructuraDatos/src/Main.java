import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Estructuras Estaticas
        Integer[] numbers = {1,2,3};
        System.out.println("numbers[0] = " + numbers[0]);
        
        numbers[0] = 200;
        System.out.println("numbers = " + numbers);

        //los arreglos son de acceso 1, es decir, se pude acceder de forma directa al dato y en un solo paso

        //No se puede agregra más items de los que se declaran
        int[]  fixedArray = new int[100]; //Declaramos un arreglo con 100 items, por defecto se cargan 100 ceros cuando se habla de números

        System.out.println("Dimensión: " + fixedArray.length);

        int[] numbersPrimitive = new int[5];
        numbersPrimitive[0] = 10;
        numbersPrimitive[1] = 20;
        //los número nos asignados se cargan en 0

        //Ingresar a una posicion que no existe
        int[] newNumbers = new int[numbersPrimitive.length+1];
        System.arraycopy(numbersPrimitive,0, newNumbers, 0 , numbersPrimitive.length);

        newNumbers[5] = 500;

        System.out.println("newNumbers = " + newNumbers);

        System.out.println("Tipo int");
        for(int number : numbersPrimitive) {
            System.out.println("number = " + number);
        }


        System.out.println("Eliminar una posición");

        int[] numbersPrimitive2 = {1,2,3,4,5,6,7,9};
        int deleteNumber = 2;


        for(int i = deleteNumber;  i < numbersPrimitive2.length; i++) {
            numbersPrimitive2[i] = numbersPrimitive2[i+1];
        }

        numbersPrimitive2[numbersPrimitive2.length-1] = 0;


        for(int i = deleteNumber;  i < numbersPrimitive2.length; i++) {
            numbersPrimitive2[i] = numbersPrimitive2[i+1];
        }

        
        for(int num : numbersPrimitive2){
            System.out.println("num = " + num);
        }
        System.out.println("*********************************");

        Integer[] numbersWrapper = new Integer[5];
        //los números no asignados se cargan en null
        numbersWrapper[0] = 20;
        numbersWrapper[1] = 30;


        System.out.println("Dinamicas");

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(10);
        numbers2.add(100);

        System.out.println("Tipo Integer");
        for (int nums : numbersWrapper) {
            System.out.println("nums = " + nums);
        }

        System.out.println("numbers2 = " + numbers2);
    }
}