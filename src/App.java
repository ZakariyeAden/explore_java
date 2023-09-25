public class App {
    public static void main(String[] args) throws Exception {
        // #1 Hello World
        System.out.println("Hello, World!");

        // #2 Variables
        String name = "Zakariye Aden";
        int x, y, z;
        // Final is like Const in Java
        final  int age = 23;
        boolean myBool = true;
        char letter = 'Z';

        x = y = z = 50;
        // Should be 150:
        System.out.println(x + y + z);
        System.out.println("Hello " + name + " age is " + age );
    }
}
