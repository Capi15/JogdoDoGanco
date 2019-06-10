package JogoDoGanso;

import static JogoDoGanso.EnumCasas.CASAGANSO;

/**
 *
 * @author Bruno Ribeiro
 * nº 21514
 */
public class Casa {
    
    private EnumCasas tipo;
    private int pos = 0;
    
    //Recebe qual o tipo de casa que saiu, e a sua posição
    public Casa(EnumCasas tipo, int pos){
        this.tipo = tipo;
        this.pos = pos;
    }
 
    //Permite saber qual o tipo de casa
    public EnumCasas getTipoCasa(){
        return tipo;
    }
    
    //Permite ir buscar a posição atual
    public int getPos(){
        return pos;
    }
}
