package JogoDoGanco;

import static JogoDoGanco.EnumCasas.CASAGANCO;

/**
 *
 * @author Bruno Ribeiro
 * nº 21514
 */
public class Casa {
    
    private String casaEspecial;
    private EnumCasas tipo;
    private int pos = 0;
    
    public Casa(EnumCasas tipo, int pos){
        this.tipo = tipo;
        this.pos = pos;
    }
 
    public EnumCasas getTipoCasa(){
        return tipo;
    }
    
    public int getPos(){
        return pos;
    }
}
