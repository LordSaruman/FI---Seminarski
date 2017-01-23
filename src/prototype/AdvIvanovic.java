/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author filip_000
 */
public class AdvIvanovic extends AdvKanc{

    public AdvIvanovic(){
        sas = new Sastav();
    }
    
    public AdvIvanovic(AdvIvanovic advi){
        sas = new Sastav();
        sas.sastav = new String(advi.sas.sastav);
    }
    @Override
    void kreirajZalbu() {
        vz = new ZalbaNaResenje();
    }

    @Override
    void kreirajMolbu() {
        km = new DefinisanoOvlascenje();
    }

    @Override
    String sastivKompletno() {
        return sas.sastav = "Zalba na presudu " + vz.vratiVrstuZalbi() + " vrati ovlascenje/molbu " + km.vratiKompletnoOvlascenje();
    }

    @Override
    public AdvKanc Clone() {
        return new AdvIvanovic(this);
    }

    @Override
    String vratiSastav() {
        return sas.sastav;
    }
    
}
