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
public class BookArray {
    private ArrayList<Book>libros;

    public BookArray() {
        libros = new ArrayList<>();
    }
    public void add(Book libro){
        libros.add(libro);
    }
    public void imprimir(){
        for(Book t:libros){
            System.out.println(t);
        }
    }
}
