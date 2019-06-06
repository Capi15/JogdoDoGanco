package JogoDoGanso;

/**
 *
 * @author Bruno Ribeiro
 * nº 21514
 */
public class Fichas {
    private int nFichas;
    
    public Fichas(int nFichas){
        this.nFichas = nFichas;
        nFichas = 50;
    }

    public int getNFichas() {
        return nFichas;
    }

    public void setnFichas(int nFichas) {
        this.nFichas = nFichas;
    }
    
}
