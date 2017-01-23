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
public class DodatniDokazi extends Decorator{
    
    private String noviDokazi;
    public DodatniDokazi(Component comp) {
        super(comp);
        noviDokazi = new String("Iznose se novi dokazi i cinjenice koja su u "
                + "direktnoj vezi sa nezgodom...");
    }
    @Override
    public void prikaziKompletnuTuzbu(){
        super.prikaziKompletnuTuzbu();
        System.out.println("Dodatni dokazi: " + noviDokazi);
    }
}
