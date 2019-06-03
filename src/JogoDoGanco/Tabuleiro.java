package JogoDoGanco;

/**
 *
 * @author Bruno Ribeiro
 * nº 21514
 */
public class Tabuleiro {
    private ListaLigada<Casa> tabuleiro;
    
    public Tabuleiro(ListaLigada<Casa> tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    
    private ListaLigada<Casa> tabuleiro(){
        return tabuleiro;
    }
}

