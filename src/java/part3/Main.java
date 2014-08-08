/*
 * 
 * Without using proxy
 * Output: name: A, param: Hello
 * 
 * Using proxy (String type):
 * Call start.
 * Output: name: A, param: Hello
 * Call end.
 * 
 * Using proxy (Integer type):
 * Call start.
 * Output: name: A, param: 1000
 * Call end.
 */
package part3;

/**
 *
 * @author jsingh
 */
public class Main {

    public static void main(String args[]) {
        Thing t;
        System.out.println("Without using proxy");
        t = new aStringThing("A");
        t.compute("Hello");
        
        Functor f = new LogFunctor();

        System.out.println("\nUsing proxy (String type):");
        Thing pStringThing = new pStringThing<String>(t, f);
        pStringThing.compute("Hello");        

        t = new aIntegerThing("A");
        System.out.println("\nUsing proxy (Integer type):");
        Thing pIntegerThing = new pIntegerThing<Integer>(t, f);
        pIntegerThing.compute(1000);
    }
}
