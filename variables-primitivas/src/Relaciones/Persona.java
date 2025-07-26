package Relaciones;

public class Persona {

    public void calculateSum(Calculator calculator){
        //relacion de dependencia
        int result = calculator.add(20,30);
        System.out.println("Suma = " +  result);
    }
}
