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
public class Client {
    AdvKanc advk;

    public Client(AdvKanc advk) {
        this.advk = advk;
    }
    
    public void Sastavi(){
        advk.kreirajMolbu();
        advk.kreirajZalbu();
        advk.sastivKompletno();
    }
    
    public static void main(String[] args) {
        Client client;
        AdvVelickovic adv = new AdvVelickovic();
        client = new Client(adv);
        client.Sastavi();
        System.out.println("Rezultat rada advokata Velickovica je: " + adv.vratiSastav());
        AdvKanc adv1 = adv.Clone();
        System.out.println("(Kopija) Rezultat rada advokata Velickovica je:" + adv1.vratiSastav());
        
        AdvIvanovic adi = new AdvIvanovic();
        client = new Client(adi);
        client.Sastavi();
        System.out.println("Rezultat rada advokata Ivanovica je: " + adi.vratiSastav());
        AdvKanc adi1 = adi.Clone();
        System.out.println("Kopija) Rezultat rada advokata Velickovica je: " + adi1.vratiSastav());
        
    }
}
