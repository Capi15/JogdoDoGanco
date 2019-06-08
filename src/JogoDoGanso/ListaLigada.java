package JogoDoGanso;

/**
 *
 * @author Bruno Ribeiro 
 * nº 21514
 */
public class ListaLigada<T> {

    private Node<T> head;
    private Node<T> last;
    private int size;

    //Construtor da lista, define os valores iniciais dos apontadores como null
    //e o seu tamanho como 0
    public ListaLigada() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    //O método isEmptety permite saber se a lita está vazia
    public boolean isEmpty() {
        return this.head == null;
    }
    //permite adicionar novos Nodes à lista
    public ListaLigada<T> push(T data) {
        //caso a lista esteja vazia é criado um novo node através da variável
        //head, a variável last recebe os valores da variável head e são definidos 
        //os apontadores, next e previous.
        if (this.isEmpty()) {
            Node<T> tmpNode = new Node<>(data, null, null);
            this.head = tmpNode;
            this.last = this.head;
            this.head.setNext(this.last);
            this.head.setPrevious(this.last);
            this.size += 1;
            return this;
        //mesmo processo, mas para um node ja existente
        } else if (!this.isEmpty()) {
            Node<T> tmpNode = new Node<>(data, null, this.last);
            this.last.setNext(tmpNode);
            this.last = this.last.getNext();
            this.last.setNext(this.head);
            this.head.setPrevious(this.last);
            this.size += 1;
            return this;
        }
        return this;
    }

    //este método permite retirar Nodes à lista
    public ListaLigada<T> pop() {
        //se a lista estiver vazia nao faz nada
        if (this.isEmpty()) {
            return this;
        //caso o tamanho da lista seja um, é decrementado 1 Node ao tamanho
        // total da lista e as variáveis head e last adquirem o valor de null
        } else if (this.size == 1) {
            this.head = null;
            this.last = null;
            this.size -= 1;
            return this;
        }
        //se o tamanho da lista for maior do que 1, os valores da da variável 
        //head do Node anterior são armazenados na variavel temporária newLast
        //que atribui o seu valor à variável last. A variavel head adquire 
        // o vlor do previous last e por fim é decrementado uma unidade ao tamanho
        // da lista ligada
        Node<T> newLast = this.last.getPrevious();
        newLast.setNext(this.head);
        this.last = newLast;
        this.head.setPrevious(this.last);
        this.size -= 1;
        return this;
    }

    //permite ver o último elemento da lista
    public Node<T> peek() {
        return this.last;
    }
    
    public Node<T> getHead() {
        return this.head;
    }
    
    public int size() {
        return this.size;
    }
}
