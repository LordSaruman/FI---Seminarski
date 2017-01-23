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
public class AdvVelickovic extends AdvKanc{

    AdvVelickovic(){
        sas = new Sastav();
    }
    @Override
    void kreirajSporazum() {
        sp = new Poravnanje();
    }

    @Override
    void kreirajTuzbu() {
        tt = new OdgovorNaTuzbu();
    }

    @Override
    void kreirajSastav() {
        sas.sastav = sp.vratiSporazum(); ///BACA GRESKU KOJI K
    }

    @Override
    String vratiSastav() {
        return sas.sastav;
    }
    
}
