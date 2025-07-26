public class Motocycle extends  Vehiculo {
//la herencia solo permite herencia de una sola clase
    private boolean hasSideCar;
    private Motor engine;

    public Motocycle(String brand, String model, int year, boolean hasSideCar) {
        super(brand, model, year);
        this.hasSideCar = hasSideCar;
        this.engine = new Motor();
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public void popWheelie() {
        System.out.println("La moto está haciendo el caballito");
    }


    public void start() {
        System.out.println("La moto está encendida");
        engine.start();
    }

    @Override
    public String toString() {
        return "Motocycle{" +
                "hasSideCar=" + hasSideCar +
                '}';
    }
}
