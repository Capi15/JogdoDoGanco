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
public class JogadorMultiplayer extends Jogador {

    private String nome1;
    private char InicialNome1;
    private String nome2;
    private char InicialNome2;

    //recebe o nome e define a inicial do jogador 1 e 2
    public JogadorMultiplayer(String nome1, String nome2) {
        this.nome1 = nome1;
        nome1 = Le.umaString();
        this.nome2 = nome2;
        nome2 = Le.umaString();
        InicialNome1 = nome1.charAt(0);
        InicialNome2 = nome2.charAt(0);
    }

    //devolve o nome do jogador1
    public String getNome1() {
        return nome1;
    }

    //devolve a inicial do jogador1
    public char getInicialNome1() {
        return InicialNome1;
    }

    //devolve o nome do jogador2
    public String getNome2() {
        return nome2;
    }

    //devolve a inicial do jogador2
    public char getInicialNome2() {
        return InicialNome2;
    }
}
