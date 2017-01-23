/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author filip_000
 */
public class ZalbaNaResenje implements VrstaZalbi{
    private Date datum = Calendar.getInstance().getTime();
    private String Sud = "Osnovni Sud Veliko Gradiste";
    private String brojPredmeta = "OV.br53/2017";

    @Override
    public String vratiVrstuZalbi() {
        String sve = datum + Sud + brojPredmeta + "";
        return sve;
    }
}
