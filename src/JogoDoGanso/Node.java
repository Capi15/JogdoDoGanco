package JogoDoGanso;

import java.io.Serializable;

/**
 *
 * @author Bruno Ribeiro nº 21514
 * @param <T>
 * 
 * Classe Genérica do tipo Node
 */
public class Node<T> implements Serializable {

    private T data;
    private Node<T> next;
    private Node<T> previous;

    //construtor do genérico do tipo Node onde sao recebidos e definidos
    //os parâmetros data, next, previous.
    public Node(T data, Node<T> next, Node<T> previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    //getter que recebe os dados de qualquer tipo T
    public T getData() {
        return this.data;
    }

    //vai buscar o valor armazenado na variável next
    public Node<T> getNext() {
        return this.next;
    }

    //permite modificar o valor da variável next
    public void setNext(Node<T> next) {
        this.next = next;
    }

    //vai buscar o valor armazenado na variável previous
    public Node<T> getPrevious() {
        return this.previous;
    }

    //permite modificar o valor da variável previous
    public void setPrevious(Node<T> next) {
        this.previous = previous;
    }
}
