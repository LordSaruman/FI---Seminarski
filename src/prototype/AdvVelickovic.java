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
public class AdvVelickovic extends AdvKanc{

    public AdvVelickovic(){
        sas = new Sastav();
    }
    
    public AdvVelickovic(AdvVelickovic advv){
        sas = new Sastav();
        sas.sastav = new String(advv.sas.sastav);
    }
    @Override
    void kreirajZalbu() {
        vz = new ZalbaNaPresudu();
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
        return new AdvVelickovic(this);
    }

    @Override
    String vratiSastav() {
        return sas.sastav;
    }
    
}
