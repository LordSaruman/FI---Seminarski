/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletone;

/**
 *
 * @author filip_000
 */
public class AdvIvanovic extends AdvKanc{

    public AdvIvanovic() {
        sas = new SastavO();
    }

    
    @Override
    public void kreirajPunomocje() {
        pu = new OgranicenoPunomocje();
    }

    @Override
    public void kreirajSastav() {
        sas.sastav = "Ograniceno punomocje " + pu.vratiPunomocje();
    }

    @Override
    public String vratiPunomocje() {
        return sas.sastav;
    }
    
}
