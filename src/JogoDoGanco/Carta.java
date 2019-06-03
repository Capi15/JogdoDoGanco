package JogoDoGanco;

import java.util.Random;

/**
 *
 * @author Bruno Ribeiro
 * nº 21514
 */
public class Carta {
    
    
    private EnumCartas enumCartas;
    private Casa casa;

    
    public Carta(EnumCartas enumCartas){
        this.enumCartas = enumCartas;
    }

    
    public int pos(){
        int pos = casa.getPos();
        return pos;
    }
}
