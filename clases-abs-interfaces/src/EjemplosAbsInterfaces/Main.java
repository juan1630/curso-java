package EjemplosAbsInterfaces;

public class Main {
    public static void main(String[] args) {
       /* Vehicle vehicle = new Vehicle("VW", "TAOS", 2024) {
            @Override
            public void drive() { //clase abstracta
                System.out.println("Estoy conduciendo!!!!");
            }
        };

        System.out.println( vehicle.toString()); */

        Vehicle electric = new ElectricCar("Tesla", "Y", 2025, Color.RED, VehicleStatus.SOLD, 100);
        System.out.println(electric.toString());
    }
}
