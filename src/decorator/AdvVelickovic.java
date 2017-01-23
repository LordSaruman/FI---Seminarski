/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author filip_000
 */
public class AdvVelickovic extends AdvKanc{

    public AdvVelickovic() {
        sas = new Sastav();
    }
    
    @Override
    public void kreirajTuzbu() {
        tt = new OdgovorNaTuzbu();
    }

    @Override
    public void kreirajSastav() {
        sas.sastav = "Odgovor na tuzbu: " + tt.vratiTuzbu();
    }

    @Override
    public String vratiSastav() {
        return sas.sastav;
    }
    
    
}
