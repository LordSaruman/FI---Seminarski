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
public class AdvVelickovic extends AdvKanc{

    @Override
    public String izborNacinaResavanjaSpora() {
        return "Advokat Velickovic predlaze da se spor pred Sudom resi na miran"
                + " nacin, tacnije poravnanjem."; 
    }

    @Override
    public String izborStrategijeResavaSpora() {
        return "\nKao strategiju, advokat Velickovic, predlaze da se, zbog ozbiljnosti"
                + "situacije, prvo vidi sta ce predloziti drugi klijent"
                + "i da se u skladu sa situacijom, nagode sa drugom stranom";
    }
    
}
