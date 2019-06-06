/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDoGanso;

/**
 *
 * @author bruno
 */
public class CartaMulta extends Carta {
    
    private int noFichas;
    public CartaMulta(int pos, int noFichas) {
        super(pos);
        this.noFichas = noFichas;
    }

    public int getNoFichas() {
        return noFichas;
    }
    
}
