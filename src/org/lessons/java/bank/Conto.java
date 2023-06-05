package org.lessons.java.bank;

import java.util.Random;

public class Conto {
    private int numeroConto;
    private String nomeProprietario;
    private double saldo;

    Random random = new Random();
    public Conto(String nomeProprietario) {
        this.numeroConto = random.nextInt(1000, 9999);
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0;
    }

    public int getNumeroConto() {
        return numeroConto;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConto(int numeroConto) {
        this.numeroConto = numeroConto;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void versaSomma(double somma){
        this.saldo += somma;
    }
    public void prelevaSomma(double somma){
        this.saldo -= somma;
    }
    public String getInfo() {
        return "Conto intestato a " + getNomeProprietario() + " | saldo: " + getSaldo() + "€";
    }

}
