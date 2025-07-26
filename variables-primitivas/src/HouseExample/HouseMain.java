package HouseExample;

public class HouseMain {
    public static void main(String[] args) {
        HouseExample myHouse = new HouseExample( 2,3,5);
        //myHouse.windows = 2;  // Esto es una mala practica

        HouseExample myHouse2 = new HouseExample( 4, 2, 20.5 );

        myHouse.setDoors(4);
        myHouse.setSize(2);
        myHouse.setWindows(3);

        myHouse2.setDoors(2);

        System.out.println("La cantidad de las puertas de la casa1 es: " + myHouse.getDoors());
        System.out.println("La cantidad de las puertas de la casa2 es: " + myHouse2.getDoors());
        myHouse.openDoor();
        myHouse2.openDoor();
        double area = myHouse2.calculateArea();
        System.out.println("area = " + area);
    }
}
