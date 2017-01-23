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
public class AdvIvanovic extends AdvKanc{

    @Override
    public String izborNacinaResavanjaSpora() {
        return "Advokat Ivanovic predlaze da se spor pred Sudom resi tako sto ce "
                + "se odbiti bilo kakva vrsta poravnanja sa drugom stranom i da"
                + "se nastavi (ne odustane) sa tuzbom protiv druge strane.";
    }

    @Override
    public String izborStrategijeResavaSpora() {
        return "\nAdvokat Ivanovic, kao strategiju resavanja spora, predlaze da se"
                + "ne odustaje od tuzbe, stavise, predlaze da se tuzba prosiri"
                + "sa novim materijalnim dokazima i saslusanjima novih svedoka";
    }
    
}
