/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDoGanco;

/**
 *
 * @author bruno
 */
public class CartaSalto extends Carta {
    
    private int noCasas;
    public CartaSalto(int pos, int noCasas) {
        super(pos);
        this.noCasas = noCasas;
    }

    public int getNoCasas() {
        return noCasas;
    }
    
}
