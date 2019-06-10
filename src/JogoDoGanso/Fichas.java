package JogoDoGanso;

/**
 *
 * @author Bruno Ribeiro
 * nº 21514
 */
public class Fichas {
    private int nFichas;
    
    //permite definir com quantas fichas se começa o jogo
    public Fichas(int nFichas){
        this.nFichas = nFichas;
    }

    
    // retorna o valor atual das fichas
    public int getNFichas() {
        return nFichas;
    }

    //permite atualizar o número de fichas
    public void setnFichas(int nFichas) {
        this.nFichas = nFichas;
    }
    
}
