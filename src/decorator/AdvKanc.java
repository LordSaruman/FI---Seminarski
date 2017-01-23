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
public abstract class AdvKanc {
    public Sastav sas;
    public Tuzba tt;

    public abstract void kreirajTuzbu();
    public abstract void kreirajSastav();
    public abstract String vratiSastav();
}
