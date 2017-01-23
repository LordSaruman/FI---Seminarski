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
public abstract class AdvKanc {
    public SastavO sas;
    public Punomocje pu;
    
    public abstract void kreirajPunomocje();
    public abstract void kreirajSastav();
    public abstract String vratiPunomocje();
}
