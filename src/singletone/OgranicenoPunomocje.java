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
public class OgranicenoPunomocje implements Punomocje{
     public String OgranicenoOvlascenja = "Ovo ovlascenje ima odredjena ogranicenja";
    public String OgranicenaVrstaPostupka = "Ovo ovlascenje se moze odnositi samo na neke postupke";
    public String OgranicenjRokaTrajanja = "Ovo ovlascenje ima rok trajanja";

    @Override
    public String vratiPunomocje() {
        String sve = OgranicenaVrstaPostupka + OgranicenoOvlascenja + OgranicenjRokaTrajanja + "";
        return sve;
    }
}
