public class Car extends  Vehiculo {


    private int door; //Atributo propios de la clase
    private Motor engine;

    public Car(String brand, String model, int year, int door) {
        super(brand, model, year);
        this.door = door;
        this.engine = new Motor();
    }


    public void start() {
        //sobre estric
        System.out.println("El auto esta encendido");
        engine.start();
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

}
