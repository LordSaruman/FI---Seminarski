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
public class Client {
    public AdvKanc adv;

    public Client(AdvKanc adv) {
        this.adv = adv;
    }
    
    public void Sastavi(){
        adv.kreirajPunomocje();
        adv.kreirajSastav();
    }
    
    public static void main(String[] args) {
        Client client;
        AdvIvanovic advis = AdvIvanovicSingleton.getInstance();
        client = new Client(advis);
        client.Sastavi();
        System.out.println("Punomocje je tipa: " + advis.vratiPunomocje());
        AdvIvanovic advis1 = AdvIvanovicSingleton.getInstance();
    }
}
