package JogoDoGanso;

/**
 *
 * @author Bruno Ribeiro
 * nº 21514
 */
public class Tabuleiro {

    private ListaLigada<Casa> tabuleiro;

    public Tabuleiro(ListaLigada<Casa> tabuleiro) {
        ListaLigada<Casa> tab = new ListaLigada<>();
        ListaLigada<Carta> carta = new ListaLigada<>();
        String getResposta ="";
        for (int i = 1; i <= 63; i++) {
            if (i % 9 == 0 || i % 5 == 0) {
                tab.push(new Casa(EnumCasas.CASAGANSO, i));
                continue;
            }
            switch (i) {
                case 6:
                    tab.push(new Casa(EnumCasas.PONTE, i));
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
        this.tabuleiro = tabuleiro;
    }

    private ListaLigada<Casa> tabuleiro() {
        return tabuleiro;
    }
}
