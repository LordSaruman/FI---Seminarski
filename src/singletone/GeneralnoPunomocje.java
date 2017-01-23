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
public class GeneralnoPunomocje implements Punomocje{
    public String bezOgranicenjaOvlascenja = "Ovo ovlascenje nema nikavu vrstu ogranicenja";
    public String bezOgranicenjaPostupka = "Ovo ovlascenje se moze odnositi na sve postupke";
    public String bezOgranicenjaRokaTrajanja = "Ovo ovlascenje nema rok trajanja";

    @Override
    public String vratiPunomocje() {
        String sve = bezOgranicenjaOvlascenja + bezOgranicenjaPostupka + bezOgranicenjaRokaTrajanja + "";
        return sve;
    }
}
