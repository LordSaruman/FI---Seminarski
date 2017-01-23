/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author filip_000
 */
public class Client {
    AdvKanc advKan;

    public Client(AdvKanc advKan) {
        this.advKan = advKan;
    }
    
    public void Sastavi1(){
        advKan.kreirajSporazum();
        advKan.kreirajTuzbu();
        advKan.kreirajSastav();
    }
    
    public static void main(String[] args) {
        Client client;
        AdvVelickovic advv = new AdvVelickovic();
        AdvIvanovic advi = new AdvIvanovic(advv);
        client = new Client(advi);
        client.Sastavi1();
        System.out.println("Sporazum i tuzba: " + advi.vratiSastav());
    }
}
