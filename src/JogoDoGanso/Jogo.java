package JogoDoGanso;

/**
 *
 * @author Bruno Ribeiro
 * nº 21514
 */
public class Jogo {
    
    private String[] tipoJogo = new String [2];
    Tabuleiro tabuleiro;
    private Casa casa;
    Fichas ficha;

    //inicia o tabuleiro
    public Jogo() {
        this.tabuleiro = new Tabuleiro();
    }

    //onde ocorre o jogo
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
