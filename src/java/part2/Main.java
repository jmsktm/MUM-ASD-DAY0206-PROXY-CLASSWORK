/*
 * 
 * Without using proxy
 * Output: name: A, param: Hello
 * 
 * Using proxy:
 * Call to Hello - start.
 * Output: name: A, param: Hello
 * Call to Hello - end.
 */
package part2;

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

        Functor f = new LogFunctor();
        Thing pThing = new pThing(t, f);
        pThing.compute("Hello");
    }
}
