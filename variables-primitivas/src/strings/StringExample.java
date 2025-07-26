package strings;

public class StringExample {
    public static void main(String[] args) {
        String name = "Jose";
        String name2 = "Juan";
        String name3 = "Jose";
        String name4 = new String("Jose"); // al declararlo de esta forma queda por fuera del pool de strings

        System.out.println( name == name2 ); //Compara las 2 direcciones de memoria y regresa un false
        System.out.println(name == name3); //regresa un true porque java los valores repetidos los maneja el pool de strings y al ser repetidos apuntan al mismo espacio de memoria
        System.out.println(name.toUpperCase());
        System.out.println("name = " + name); //Demuestra que es inmutable ya que el valor no cambia sino regresa un nuevo valor
        System.out.println(name == name4);
    }

}
