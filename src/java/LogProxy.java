/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsingh
 */
public class LogProxy implements Thing {

    Thing proxyThing;

    public LogProxy(Thing t) {
        proxyThing = t;
    }

    @Override
    public void compute(String str) {
        if (proxyThing != null) {
            pre();
            delegate(str);
            post();
        }
    }

    void pre() {
        System.out.println("Pre-execution log");
    }

    void delegate(String str) {
        proxyThing.compute(str);
    }

    void post() {
        System.out.println("Post-execution log");
    }
}
