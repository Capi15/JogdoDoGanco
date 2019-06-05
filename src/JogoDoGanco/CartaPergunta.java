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
public class CartaPergunta extends Carta {
    
    private String pergunta;
    private String resposta;
    private String resultadoResposta;
    private int novaPosicao;
    
    public CartaPergunta(int pos, String pergunta, String resposta) {
        super(pos);
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
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
        if (pergunta == resposta){   
        pos += novaPosicao;
        return resultadoResposta = "Você acertou";
        }else
            pos = pos;
        return resultadoResposta = "Você errou";
    }
    
}
