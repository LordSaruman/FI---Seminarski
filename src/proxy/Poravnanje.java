/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author filip_000
 */
public class Poravnanje implements Sporazum{

    private String Sud = "Osnovni sud u Velikom Gradistu";
    private String OverenaPresuda = "Overena je u Sudu";
    private String TekstPoravnanja = "Poravnanje: Moj klijent ... saglasan je sa..";

    @Override
    public String vratiSporazum() {
        String sve = Sud + OverenaPresuda + TekstPoravnanja + "";
        return sve;
    }
    
    
}
