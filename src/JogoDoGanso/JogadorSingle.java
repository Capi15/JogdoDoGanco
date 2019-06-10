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
public class JogadorSingle extends Jogador {

    private String nome1;
    private char InicialNome1;

    //recebe o nome e define a inicial do jogador 1
    public JogadorSingle(String nome1) {
        this.nome1 = nome1;
        nome1 = Le.umaString();
        InicialNome1 = nome1.charAt(0);
    }

    //devolve o nome do jogador1
    public String getNome1() {
        return nome1;
    }

    //devolve a inicial do jogador1
    public char getInicialNome1() {
        return InicialNome1;
    }
}
