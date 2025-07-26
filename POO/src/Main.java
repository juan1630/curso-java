//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* Vehiculo vehicle = new Vehiculo("WV", "Virtus", 2024);
        vehicle.setYear(2023); */

        Vehiculo myCar = new Car("WV", "Tiguan", 2025, 4);
        Vehiculo myMoto = new Motocycle("Italika", "de repartidor", 2023, false);

        ((Car)myCar).start();
        ((Motocycle)myMoto).start();
        printVehicle(myCar);
        printVehicle(myMoto);
        //Casteo del metodo
        ((Car)myCar).setDoor(5);
        printVehicle(myCar);
    }

    public static  void printVehicle(Vehiculo vehiculo) {
        System.out.println(vehiculo.toString());
    }
}