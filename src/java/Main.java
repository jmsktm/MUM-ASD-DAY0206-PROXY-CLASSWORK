/*
 * Output from the program:
 * 
 * Without using proxy
 * Output: name: A, param: Hello
 * 
 * Using proxy:
 * Pre-execution log
 * Output: name: A, param: Hello
 * Post-execution log
 */

/**
 *
 * @author jsingh
 */
public class Main {

    public static void main(String args[]) {
        System.out.println("Without using proxy");
        Thing t = new aThing("A");
        t.compute("Hello");

        System.out.println("\nUsing proxy:");

        Thing pThing = new LogProxy(t);
        pThing.compute("Hello");
    }
}
