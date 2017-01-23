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
public class Client  implements Component{

    AdvKanc advk;

    public Client(AdvKanc advk) {
        this.advk = advk;
    }
    
    public void SastaviT(){
        advk.kreirajTuzbu();
        advk.kreirajSastav();
    }
    @Override
    public void prikaziKompletnuTuzbu() {
        System.out.println("Tuzba: ");
    }
    
    public static void main(String[] args) {
        Client client;
        AdvIvanovic advi = new AdvIvanovic();
        client = new Client(advi);
        client.SastaviT();
        DodatnoLice dl = new DodatnoLice(client);
        DodatniDokazi dk = new DodatniDokazi(dl);
        
        dk.prikaziKompletnuTuzbu();
    }
    
}
