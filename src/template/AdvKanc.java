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
public abstract class AdvKanc {
    
    public String nacinResavanjaSpora(){
        String pro = izborNacinaResavanjaSpora();
        pro = pro + izborStrategijeResavaSpora();
        return pro;
    }
    
    public abstract String izborNacinaResavanjaSpora();
    public abstract String izborStrategijeResavaSpora();
}
