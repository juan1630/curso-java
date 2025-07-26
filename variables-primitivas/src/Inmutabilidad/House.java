package Inmutabilidad;


/*
* para que una clase sea inmutable primero se debe de agregar la palabra final
* Segundo todos los atributos son privados, con la palabra final e implementar el constructor
* Tercero no se implementan métodos setter para los atributos, solo usar metodos Getters
* Cuarto las clases Inmutables no pueden ser extendidas, no pueden ser heredadas
* */
public final class House {

    private final int doors;
    private final int windows;
    private final double size;

    public House(int doors, int windows, double size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public double getSize() {
        return size;
    }
}
