package JogoDoGanso;

/**
 *
 * @author Bruno Ribeiro nº 21514
 */
public class Tabuleiro {

    private ListaLigada<Casa> tabuleiro;
    private ListaLigada<Carta> cartas;
    JogadorSingle jogador1;
    private Node<Casa> currCasa;
    private Node<Carta> currCarta;

    //criação de um tabuleiro
    public Tabuleiro() {
        this.tabuleiro = new ListaLigada<>();
        this.cartas = new ListaLigada<>();

        //adição de casas à lista
        cartas.push(new CartaPergunta("Onde se localiza a ESTG?", "Viana do Catelo"));
        cartas.push(new CartaPergunta("Qual a moeda mais usada no continente Europeu?", "Euro"));
        cartas.push(new CartaMulta(5));
        cartas.push(new CartaPergunta("Quanto é 21x30?", "630"));
        cartas.push(new CartaSalto(7));
        cartas.push(new CartaPergunta("Qual é o animal terrestre mais veloz?", "Chita"));
        cartas.push(new CartaMulta(5));
        cartas.push(new CartaPergunta("Qual é o animal voador mais veloz?", "Falcão Peregrino"));
        cartas.push(new CartaPergunta("A que grupo pertence a marca \"Continente?\"", "Grupo SONAE"));
        cartas.push(new CartaMulta(10));
        cartas.push(new CartaSalto(3));
        cartas.push(new CartaPergunta("Qual o apelido do Cordenador de curso da ECGM", "Romero"));

        //percorre as casas do tabuleiro e verifica as posições das casas
        //especiais através do switch
        for (int i = 1; i <= 63; i++) {
            switch (i) {
                case 6:
                    tabuleiro.push(new Casa(EnumCasas.PONTE, i));
                    break;
                case 19:
                    tabuleiro.push(new Casa(EnumCasas.ALBERGE, i));
                    break;
                case 31:
                    tabuleiro.push(new Casa(EnumCasas.POCO, i));
                    break;
                case 42:
                    tabuleiro.push(new Casa(EnumCasas.LABIRINTO, i));
                    break;
                case 52:
                    tabuleiro.push(new Casa(EnumCasas.PRISAO, i));
                    break;
                case 58:
                    tabuleiro.push(new Casa(EnumCasas.MORTE, i));
                    break;
                default:
                    tabuleiro.push(new Casa(EnumCasas.NORMAL, i));
            }
        }
    }

    //recebe as cartas da lista
    public ListaLigada<Carta> getCartas() {
        return this.cartas;
    }

    //devolve o Tabuleiro, ou seja, a lista de casas
    public ListaLigada<Casa> getTabuleiro() {
        return this.tabuleiro;
    }

    //permite calcular qual será a proxima casa
    public Casa getNextCasa(int saltaCasas) {
        
        boolean stepBack = false;
        Fichas ficha = new Fichas(50);
        CartaMulta fichaM = null;

        if (this.currCasa == null) {
            this.currCasa = this.tabuleiro.getHead();
        }

        for (int i = 0; i < saltaCasas; i++) {
            if (this.currCasa.getData().getPos() == 63) {
                //se a variável stepback for verdadeira o numero da casa vai subindo
                stepBack = true;
                ficha.setnFichas(ficha.getNFichas() - fichaM.getNoFichas());
                if (ficha.getNFichas() == 0) {
                    System.out.println("O jogo chegou ao fim");
                    jogador1.getNome1();
                } else {
                    continue;
                }
            }
            //se a variável stepback for falsa o numero da casa vai descendo
            if (stepBack) {
                this.currCasa = this.currCasa.getPrevious();
                ficha.setnFichas(ficha.getNFichas() - fichaM.getNoFichas());
                /*if (ficha.getNFichas() == 0) {
                    System.out.println("O jogo chegou ao fim");
                    jogador1.getNome1();
                } else {
                    continue;
                }*/
            } else {
                this.currCasa = this.currCasa.getNext();
                /*ficha.setnFichas(ficha.getNFichas() - fichaM.getNoFichas());
                if (ficha.getNFichas() == 0) {
                    System.out.println("O jogo chegou ao fim");
                    jogador1.getNome1();
                } else {
                    continue;
                }*/
            }
        }

        return this.currCasa.getData();
    }

    //permite aceder aos dados da próxima carta
    public Carta getNextCarta() {
        if (this.currCarta == null) {
            this.currCarta = this.cartas.peek();
        }

        this.currCarta = this.currCarta.getNext();

        return this.currCarta.getData();
    }
}
