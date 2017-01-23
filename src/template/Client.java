/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author filip_000
 */
public class Client {
    AdvKanc advk;

    public Client(AdvKanc advk) {
        this.advk = advk;
    }
    
    public static void main(String[] args) {
        System.out.println("Predlog advokata Velickovica\n");
        AdvVelickovic advv = new AdvVelickovic();
        Client client = new Client(advv);
        System.out.println(client.advk.nacinResavanjaSpora());
        System.out.println("______________________");
        
        System.out.println("Predlog advokata Ivanovica\n");
        AdvIvanovic advi = new AdvIvanovic();
        Client client2 = new Client (advi);
        System.out.println(client2.advk.nacinResavanjaSpora());
        System.out.println("______________________");
    }
}
