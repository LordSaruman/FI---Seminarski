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
public abstract class AdvKanc {
    VrstaZalbi vz;
    KompletnoOvlascenje km;
    Sastav sas;
    
    abstract void kreirajZalbu();
    abstract void kreirajMolbu();
    abstract String sastivKompletno();
    abstract public AdvKanc Clone();
    abstract String vratiSastav();
}
