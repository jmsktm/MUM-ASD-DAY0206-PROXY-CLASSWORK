/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package part3;

/**
 *
 * @author james
 */
public class LogFunctor implements Functor {

    @Override
    public void pre() {
        System.out.println("Call start.");
    }

    @Override
    public void post() {
        System.out.println("Call end.");
    }
    
}
