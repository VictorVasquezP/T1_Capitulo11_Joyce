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
public class SevenDaySubscriber extends NewspaperSubscriber {

    public SevenDaySubscriber(String Calle) {
        super(Calle);
        setTasa();
    }

    @Override
    public String toString(){
        return String.format("Calle:%s  ,  Tarifa:%.2f  ,   Tipo:SevenDay",this.getCalle(),this.getTasa());
    }
    @Override
    public void setTasa() {
        this.Tasa=4.5;
    }

    
}
