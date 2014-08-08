package part3;

import part2.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jsingh
 */
public class pStringThing<String> implements Thing<String> {

    Thing proxyThing;
    Functor f;

    public pStringThing(Thing t, Functor f) {
        proxyThing = t;
        this.f = f;
    }

    @Override
    public void compute(String str) {
        if (proxyThing != null) {
            f.pre();
            proxyThing.compute(str);
            f.post();
        }
    }
}
