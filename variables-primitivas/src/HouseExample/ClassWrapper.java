package HouseExample;

public class ClassWrapper {
    public static void main(String[] args) {
        int number = 10;
        Integer number2 = Integer.valueOf(20);
        System.out.println("number2 = " + number2);
        int numberCasted = Integer.parseInt("123");
        System.out.println("numberCasted = " + numberCasted);

        String text = Integer.toString(123);
        System.out.println("text = " + text);

        int result = Integer.compare(10, 20); //Compara 2, Resultado es -1 porque 10 < 20
        System.out.println("result = " + result);
        
        int max = Integer.max(20, 30);
        //Regresa el valor maximo
        System.out.println("max = " + max);
    }
}
