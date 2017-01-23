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
public class OdgovorNaTuzbu implements Tuzba{
    private String Cinjenice = "Sakupljene cinjenice su neosporne";
    private String Svedoci = "Svedoci su dole navedeni u tekstu";
    private String Dokazi = "Prikazani dokazi su neosporni";

    @Override
    public String vratiTuzbu() {
        String sve = Cinjenice + Svedoci + Dokazi + "";
        return sve;
    }
}
