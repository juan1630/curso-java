package Relaciones;

public class House {

    //Estamos relacionando varias clases entre si
    private Room room;
    private Door door;//La relación entre la casa y las puertas es fuerte
    private Owner owner; //Relacion entre la casa y el dueño es debil por lo que es una asociacion

    public House(Room room, Door door, Owner owner) {
        this.room = room;
        this.door = door;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "room=" + room +
                ", door=" + door +
                ", owner=" + owner +
                '}';
    }
}
