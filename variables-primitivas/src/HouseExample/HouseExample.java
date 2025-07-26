package HouseExample;

public class HouseExample {

    private int doors;
    //los atributos privados solo son visibles dentro de la clase
    private int windows;
    private double size;

    void openDoor() {
        System.out.println("Puerta abierta..");
    }

    public HouseExample(int doors, int windows, double size) {
        this.doors = doors;
        this.size = size;
        this.windows = windows;
    }

    public HouseExample() {
        //Sobre carga de constructores
    }

    double calculateArea() {
        return size * size;
    }

    /// Getters Y Setters

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
