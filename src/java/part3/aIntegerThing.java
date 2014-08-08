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
public class aIntegerThing implements Thing<Integer> {

    private String name;

    public aIntegerThing(String name) {
        this.name = name;
    }

    @Override
    public void compute(Integer intg) {
        System.out.println("Output: name: " + name + ", param: " + intg);
    }
}
