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
public class OsporavanjeTuzbenogZahteva implements Tuzba{
    private String NetacniPodaci = "Navedeni podaci u tuzbi su neistiniti";
    private String NeistinitiDokaci = "Prikazani dokazi su sporni";
    private String NedostatakMaterijalnihDokaza = "Odbacujemo tuzbu zbog nedostatka materijalnih dokaza";

    @Override
    public String vratiTuzbu() {
        String sve = NedostatakMaterijalnihDokaza + NeistinitiDokaci + NetacniPodaci;
        return sve;
    }
}
