package part2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jsingh
 */
public class pThing implements Thing {

    Thing proxyThing;
    Functor f;

    public pThing(Thing t, Functor f) {
        proxyThing = t;
        this.f = f;
    }

    @Override
    public void compute(String str) {
        if (proxyThing != null) {
            f.pre(str);
            proxyThing.compute(str);
            f.post(str);
        }
    }
}
