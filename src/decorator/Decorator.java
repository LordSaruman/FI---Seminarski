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
public class Decorator implements Component{

    Component comp;

    public Decorator(Component comp) {
        this.comp = comp;
    }
    
    @Override
    public void prikaziKompletnuTuzbu() {
        comp.prikaziKompletnuTuzbu();
    }
    
}
