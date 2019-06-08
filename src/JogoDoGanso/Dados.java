package JogoDoGanso;

import java.util.Random;

/**
 *
 * @author Bruno Ribeiro
 * nº 21514
 */
public class Dados {
    
    public static int atiraDados(){
        int face1; //número do primeiro dado
        int face2; //número do segundo dado
        int total; //soma total das faces dos dados
        Random rnd = new Random(); //inicializa uma variável do tipo Random()
        
        //define números inteiros aleatórios entre 1 e 6 para cada dado
        face1 = 1 + rnd.nextInt(6);
        face2 = 1 + rnd.nextInt(6);
        
        total = face1 + face2; //a soma dos dados é armazenada na variável total
        //System.out.print(total); // imprime o valor da variável total
        return total; //devolve o valor da variável total   
    }
}
