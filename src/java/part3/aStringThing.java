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
public class aStringThing implements Thing<String> {

    private String name;

    public aStringThing(String name) {
        this.name = name;
    }

    @Override
    public void compute(String str) {
        System.out.println("Output: name: " + name + ", param: " + str);
    }
}
