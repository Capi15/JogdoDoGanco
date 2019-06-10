/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDoGanso;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author bruno
 */
public class Main {

    public static void main(String[] args){
        Jogo jogo = new Jogo();
        Print.header();
        jogo.start();
        ListaLigada<Carta> cartas = jogo.tabuleiro.getCartas();
        //for (Node<Carta> cartas = null, cartas!= null, cartas ++){
            
        //}
        String fileName = "data.bin";
        try {
            ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(fileName));
            oos.writeObject(cartas);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("gravou");
        
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            ListaLigada<Carta> c = (ListaLigada<Carta>) ois.readObject();
            System.out.println(cartas);
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
