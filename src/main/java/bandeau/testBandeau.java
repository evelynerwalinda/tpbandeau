/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author erwalind
 */
public class testBandeau {
    private final Bandeau monBandeau = new Bandeau();
    Scenario s = new Scenario();
    
    public static void main(String[] args) {
	    new testBandeau().exemple();
    }
    
    public void exemple(){
        s.addEffect(new Zoom(6, "Just a Sample"), 2);
        s.playOn(monBandeau);
    }
}
