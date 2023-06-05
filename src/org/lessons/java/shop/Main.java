package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {


        Prodotto scarpa = new Prodotto("ScarpeUno", "Descrizione di scarpe uno", 100, 22);


        System.out.println(scarpa.getNomeIntero());
        System.out.println(scarpa.getPrezzoIva());
    }
}
