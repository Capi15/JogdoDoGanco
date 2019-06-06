/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDoGanso;

/**
 *
 * @author bruno
 */
public class CartaPergunta extends Carta {
    
    private String perguntaR;
    private String resposta;
    private String resultadoResposta;
    private int novaPosicao;
    
    public CartaPergunta(int pos, String perguntaR, String resposta) {
        super(pos);
        this.perguntaR = perguntaR;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return perguntaR;
    }

    public String getResposta() {
        return resposta;
    }

    public String getResultadoResposta() {
        return resultadoResposta;
    }

    public int getNovaPosicao() {
        return novaPosicao;
    }
    
    
    
    public String comparaResposta(){
        Fichas ficha = null;
        int x = 5;
        if (perguntaR == resposta){   
        pos += novaPosicao;
        return resultadoResposta = "Você acertou";
        }else
            pos = pos;
            ficha.setnFichas(ficha.getNFichas() - x);
        return resultadoResposta = "Você errou";
    }
    
}
