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
    
    //recebe como parametro o noFichas total a pagar e Atualiza o Numero total
    //de fichas disponiveis em jogo
    public CartaMulta(int noFichas) {
        this.noFichas = noFichas; 
    }

    //devolve o número de fichas a pagar
    public int getNoFichas() {
        return noFichas;
    }
    
}
