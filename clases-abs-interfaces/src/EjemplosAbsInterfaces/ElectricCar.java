package EjemplosAbsInterfaces;

public class ElectricCar extends Vehicle  implements Electric, SelfDrive {
//implementacion de las interfaces es con la palabra implements
// se pueden heredar multiples interfaces a diferencia de las clases

    private int batteryLabel;

    public ElectricCar(String brand, String model, int year, int batteryLabel) {
        super(brand, model, year);
        this.batteryLabel = batteryLabel;
    }

    public ElectricCar(String brand, String model, int year, Color color, VehicleStatus vehicleStatus, int batteryLabel) {
        super(brand, model, year, color, vehicleStatus);
        this.batteryLabel = batteryLabel;
    }

    @Override
    public  void  drive() {
        System.out.println("El auto electrico está en marcha");
    }

    @Override
    public void chargeBattery() {
        batteryLabel = MAX_BATTERY_CAPACITY;
        System.out.println("La bateria se cargo");
    }

    @Override
    public void activateAutoPilot() {
        System.out.println("Esta conduciendo solo ");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLabel=" + batteryLabel +
                '}' + super.toString();
    }
}
