import java.security.cert.X509CRLSelector;

public class App {
    public static void main(String[] args) throws Exception {
        // #1 Hello World
        System.out.println("Hello, World!");

        // #2 Variables
        char letter = 'Z';
        String name = "Zakariye Aden";

        // Final is like Const in Java
        final  int age = 23;
        System.out.println("Hello " + name + " age is " + age );  // Name and age

        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);  // Should be 150:

        boolean myBool = true;
        System.out.println("Boolean:" + myBool); // Should be true


        // #3 Type Casting
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual Casting: Double to Int!

        System.out.println("myDouble should be:" + myDouble); // Output: 9.78
        System.out.println("myInt should be:" + myInt); // Output: 9

         // #4 Conditional
         if(x > 20){
            System.out.println("50 is more than 20!"); // Should log '50 is more than 20!'
         } else {
            System.out.println("50 is less than 20!");
         }

    }
}
