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
public class AdvIvanovic extends AdvKanc{

    public AdvIvanovic() {
        sas = new Sastav();
    }
    
    @Override
    public void kreirajTuzbu() {
        tt = new OsporavanjeTuzbenogZahteva();
    }

    @Override
    public void kreirajSastav() {
        sas = new Sastav();
    }

    @Override
    public String vratiSastav() {
        return sas.sastav;
    }
    
}
