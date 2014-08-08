package part3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jsingh
 */
public class pIntegerThing<Integer> implements Thing<Integer> {

    Thing proxyThing;
    Functor f;

    public pIntegerThing(Thing t, Functor f) {
        proxyThing = t;
        this.f = f;
    }

    @Override
    public void compute(Integer intg) {
        if (proxyThing != null) {
            f.pre();
            proxyThing.compute(intg);
            f.post();
        }
    }
}
