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
    private int novaPosicao;
    
    public CartaPergunta(String perguntaR, String resposta) {
        this.perguntaR = perguntaR;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return perguntaR;
    }

    public String getResposta() {
        return resposta;
    }

    public int getNovaPosicao() {
        return novaPosicao;
    }
    
    public boolean comparaResposta(String respostaDoUtilizador){
        return this.resposta.equalsIgnoreCase(respostaDoUtilizador);
    }
    
}
