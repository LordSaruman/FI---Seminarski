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
public class AdvIvanovicSingleton {
    static boolean uniqueInstance = false;
    static AdvIvanovic advi;
    
    
    static AdvIvanovic getInstance(){
        if (uniqueInstance == false) {
            System.out.println("Pravi se punomocje");
            uniqueInstance = true;
            advi = new AdvIvanovic();
        }else{
            System.out.println("Vec ste potpisali punomocje");
        }
        return advi;
    }
    
}
