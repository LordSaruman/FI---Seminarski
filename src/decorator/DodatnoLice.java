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
public class DodatnoLice extends Decorator{
    private String novaLica;

    public DodatnoLice(Component comp) {
        super(comp);
        novaLica = new String("Tuzba se prosiruje i na jos jedno lice koje je"
                + " ucestvovalo u nezgodi - Vladimira Gajica");
    }
    @Override
    public void prikaziKompletnuTuzbu(){
        super.prikaziKompletnuTuzbu();
        System.out.println("Dodatno lice: " + novaLica);
    }
}
