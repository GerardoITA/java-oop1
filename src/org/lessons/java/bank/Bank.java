package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {


    public static void main(String[] args) {

        Conto mioConto = new Conto("Gerardo");

        Scanner scanner = new Scanner(System.in);
        boolean uscire = false;
        while (!uscire) {
            System.out.println("Vuoi versare una somma, prelevare oppure uscire?");
            String scelta = scanner.next();

            if (scelta.equalsIgnoreCase("versare")) {
                System.out.println("Inserisci la somma di denaro");
                double sommaScelta = scanner.nextDouble();
                mioConto.versaSomma(sommaScelta);
                System.out.println("Il saldo corrente ammonta a " + mioConto.getSaldo() + "€");


            } else if ( scelta.equalsIgnoreCase("prelevare")) {
                System.out.println("Inserisci la somma di denaro");
                double sommaScelta = scanner.nextDouble();
                if (mioConto.getSaldo() - sommaScelta >= 0) {
                    mioConto.prelevaSomma(sommaScelta);
                    System.out.println("Il saldo corrente ammonta a " + mioConto.getSaldo() + "€");
                } else {
                    System.out.println("La somma scelta deve essere uguale o inferiore a " + mioConto.getSaldo() + "€");
                }

            } else if ( scelta.equalsIgnoreCase("uscire")) {
                uscire = true;
            } else {
                System.out.println("Scelta non valida");
            }


        }



    }
}
