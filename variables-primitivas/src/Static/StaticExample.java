package Static;

public class StaticExample {

        static int counter = 0;

        public StaticExample() {
            counter++;
        }

        public void ShowCount() {
            System.out.println("Counter: " + counter);
        }
}
