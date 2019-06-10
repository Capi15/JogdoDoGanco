package JogoDoGanso;

/**
 *
 * @author Bruno Ribeiro
 * nº 21514
 */
public abstract class Jogador {
    
    private boolean isSingle = false;

    
    public Jogador(){
        
    }

    //permite verificar se o jogo é multiplayer ou singleplayer
    public boolean isIsSingle() {
        return isSingle;
    }

    //permite definir o jogo como multiplayer ou singleplayer
    public void setIsSingle(boolean isS) {
        this.isSingle = isS;
    }
}
