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
    
    private String pergunta;
    private String resposta;
    private int novaPosicao;
    
    //Este construtor permite receber uma pergunta e uma resposta
    public CartaPergunta(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    //acessa ao conteúdo da variável pergunta 
    public String getPergunta() {
        return pergunta;
    }

    //acessa ao conteúdo da variável resposta
    public String getResposta() {
        return resposta;
    }

    //acessa ao valor da nova posição
    public int getNovaPosicao() {
        return novaPosicao;
    }

    //permite atualizar os valores da posição
    public void setNovaPosicao(int novaPosicao) {
        this.novaPosicao = novaPosicao;
    }
    
    //verifica se a resposta do utilizador é verdadeira ou falsa
    public boolean comparaResposta(String respostaDoUtilizador){
        return this.resposta.equalsIgnoreCase(respostaDoUtilizador);
    }
    
}
