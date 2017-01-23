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
public class DefinisanoOvlascenje implements KompletnoOvlascenje{
    private String vrstaOvlascenja = "Ovlascenje za zastapunje";
    private String razlogOvlascenja = "Za zastupanje u sudskom postupku";
    private String definisanProblem = "Stranka je u inostranstvu i daje ovlascenje advokatu da je zastupa u njenom odsustvu";
    private String napomena = "Ovlascenje je ogranicenog karaktera (sa odredjenim rokom)";

    @Override
    public String vratiKompletnoOvlascenje() {
        String sve = vrstaOvlascenja + razlogOvlascenja + definisanProblem + napomena + "";
        return sve;
    }
}
