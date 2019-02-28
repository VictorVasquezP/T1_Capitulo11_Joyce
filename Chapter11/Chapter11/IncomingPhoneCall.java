/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

/**
 *
 * @author Victor
 */
public class IncomingPhoneCall extends PhoneCall {

    public IncomingPhoneCall(String NumeroT) {
        super(NumeroT);
        setPrecio();
    }

    @Override
    public String getNumeroT() {
        return NumeroT;
    }

    @Override
    public double getPrecio() {
        return Precio;
    }

    @Override
    public String toString() {
        return String.format("Numero:%s, Precio:%.2f,  Tarifa:%.2f",this.getNumeroT(),this.getPrecio(),this.getPrecio());
    }

    @Override
    public void setPrecio() {
        this.Precio=0.02f;
    }

    
}
