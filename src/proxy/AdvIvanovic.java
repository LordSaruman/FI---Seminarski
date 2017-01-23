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
public class AdvIvanovic extends AdvKanc{

    AdvVelickovic advv;

    public AdvIvanovic(AdvVelickovic advv) {
        this.advv = advv;
    }
    
    @Override
    void kreirajSporazum() {
        advv.kreirajSporazum();
    }

    @Override
    void kreirajTuzbu() {
        advv.kreirajTuzbu();
    }

    @Override
    void kreirajSastav() {
        advv.kreirajSastav();
    }

    @Override
    String vratiSastav() {
        return advv.vratiSastav();
    }
    
}
