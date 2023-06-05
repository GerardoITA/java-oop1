package org.lessons.java.shop;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    public Prodotto(int codice, String nome, String descrizione, double prezzo, int iva) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }


     public int getCodice(){
        return codice;
     }
     public String getNome(){
         return nome;
     }
     public String getDescrizione(){
         return descrizione;
     }
     public double getPrezzo(){
         return prezzo;
     }
     public int getIva(){
         return iva;
     }

    public void setCodice( int codice){
        this.codice = codice;
    }
    public void setNome(String nome ){
        this.nome = nome;
    }
    public void setDescrizione( String descrizione){
        this.descrizione = descrizione;
    }
    public void setPrezzo( double prezzo){
        this.prezzo = prezzo;
    }
    public void setIva( int iva){
        this.iva = iva;
    }
}
