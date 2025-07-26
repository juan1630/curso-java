package Static;

import Inmutabilidad.House;
import org.w3c.dom.css.Counter;

public class Main {

    static  String appName;

    static  {
        appName = "Mi app en JAVA";
        System.out.println(appName);
    }
    public static void main(String[] args) {
        System.out.println(appName);// los metodos estaticos siempre se ejecutan, normalmente se usan para configuraciones
        //ya que se ejecuta antes que el metodo
        StaticExample count = new StaticExample();
        StaticExample count2 = new StaticExample();
        StaticExample count3 = new StaticExample();
        StaticExample count4 = new StaticExample();


        count.ShowCount();
        count4.ShowCount();
        
        int result = MathUtils.square(5);
        System.out.println("result = " + result);


        House house = new House( 2,3,80 );
        //No se puede modificar
        System.out.println("house doors = " + house.getDoors());
    }
}
