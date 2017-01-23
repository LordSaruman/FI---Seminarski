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
public class AdvVelickovic extends AdvKanc{

    public AdvVelickovic() {
        sas = new SastavO();
    }

    
    @Override
    public void kreirajPunomocje() {
        pu = new GeneralnoPunomocje();
    }

    @Override
    public void kreirajSastav() {
        sas.sastav = "Generalno punomocje " + pu.vratiPunomocje();
    }

    @Override
    public String vratiPunomocje() {
        return sas.sastav;
    }
    
}
