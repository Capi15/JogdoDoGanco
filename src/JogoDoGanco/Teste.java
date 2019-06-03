/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDoGanco;

/**
 *
 * @author bruno
 */
public class Teste {
    
    public static void main (String[] args){
        
        ListaLigada<Casa> tab = new ListaLigada<>();
        ListaLigada<Carta> carta = new ListaLigada<>();
        for(int i = 1; i <= 63; i++) {
            if (i % 9 == 0 || i % 5 == 0) {
                tab.push(new Casa(EnumCasas.CASAGANCO, i));
                continue;
            }
            switch(i) {
                case 6: 
                    tab.push(new Casa(EnumCasas.PONTE, i));
                    carta.push(new Carta(EnumCartas.PERGUNTA, i));
                    break;
                case 19:
                    tab.push(new Casa(EnumCasas.ALBERGE, i));
                    break;
                case 31: 
                    tab.push(new Casa(EnumCasas.POCO, i));
                    break;
                case 42:
                    tab.push(new Casa(EnumCasas.LABIRINTO, i));
                    break;
                case 52:
                    tab.push(new Casa(EnumCasas.PRISAO, i));
                    break;
                case 58:
                    tab.push(new Casa(EnumCasas.MORTE, i));
                    break;
                default:
                     tab.push(new Casa(EnumCasas.NORMAL, i));
            }
            
        }
    }
}
