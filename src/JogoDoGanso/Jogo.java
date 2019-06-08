package JogoDoGanso;

/**
 *
 * @author Bruno Ribeiro
 * nº 21514
 */
public class Jogo {
    
    private Tabuleiro tabuleiro;
    
    public Jogo() {
        this.tabuleiro = new Tabuleiro();
    }

    public void start() {
        int steps = Dados.atiraDados();
        System.out.println("avancar: " + steps);
        System.out.println(this.tabuleiro.getNextCasa(steps).getPos());
        System.out.println(this.tabuleiro.getNextCarta());
        System.out.println(this.tabuleiro.getNextCarta());
        System.out.println(this.tabuleiro.getNextCarta());
        System.out.println(this.tabuleiro.getNextCarta());
        System.out.println(this.tabuleiro.getNextCarta());
        System.out.println(this.tabuleiro.getNextCarta());
        System.out.println(this.tabuleiro.getNextCarta());
        System.out.println(this.tabuleiro.getNextCarta());
        System.out.println(this.tabuleiro.getNextCarta());
        System.out.println(this.tabuleiro.getNextCarta());
        System.out.println(this.tabuleiro.getNextCarta());
        System.out.println(this.tabuleiro.getNextCarta());
    } 
}
