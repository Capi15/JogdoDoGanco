package JogoDoGanso;

/**
 *
 * @author Bruno Ribeiro nº 21514
 */
public class Tabuleiro {

    private ListaLigada<Casa> tabuleiro;
    private ListaLigada<Carta> cartas;
    
    private Node<Casa> currCasa;
    private Node<Carta> currCarta;

    public Tabuleiro() {
        this.tabuleiro = new ListaLigada<>();
        this.cartas = new ListaLigada<>();

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
    
    public ListaLigada<Carta> getCartas(){
        return this.cartas;
    }
    
    public ListaLigada<Casa> getTabuleiro(){
        return this.tabuleiro;
    }
    
    public Casa getNextCasa(int saltaCasas){
        boolean stepBack = false;
        
        if (this.currCasa == null) this.currCasa = this.tabuleiro.getHead();
        
        for (int i = 0; i < saltaCasas; i++) {
            if (this.currCasa.getData().getPos() == 63) stepBack = true;
            
            if (stepBack) this.currCasa = this.currCasa.getPrevious();
            else this.currCasa = this.currCasa.getNext();
        }
        
        return this.currCasa.getData();
    }
    
    public Carta getNextCarta() {
        if (this.currCarta == null) this.currCarta = this.cartas.peek();
        
        this.currCarta = this.currCarta.getNext();
        
        return this.currCarta.getData();
    }
}
