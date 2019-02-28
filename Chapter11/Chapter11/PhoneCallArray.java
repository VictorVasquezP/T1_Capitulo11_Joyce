/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class PhoneCallArray {
    private ArrayList<PhoneCall>cel;

    public PhoneCallArray() {
        cel=new ArrayList<>();
    }
    public void add(PhoneCall p){
        cel.add(p);
    }
    public void imprimir(){
        for(PhoneCall t: cel){
            System.out.println(t);
        }
    }
}
