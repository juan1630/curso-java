public class Bicycle extends Vehiculo {
// las subclases heredan todo
    private boolean hasBell;

    public Bicycle(String brand, String model, int year, boolean hasBell) {
        super(brand, model, year);
        this.hasBell = hasBell;
    }



}
