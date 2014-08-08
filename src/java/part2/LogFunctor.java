/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package part2;

/**
 *
 * @author james
 */
public class LogFunctor implements Functor {

    @Override
    public void pre(String str) {
        System.out.println("Call to "+str+" - start.");
    }

    @Override
    public void post(String str) {
        System.out.println("Call to "+str+" - end.");
    }
    
}
