package org.lessons.java;
//importo scanner per leggere imput utente
import java.util.Scanner;
public class StampaSaluto {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This is my first Java repo");

        //leggo imput utento e ricambio il saluto 🗿
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nome = input.nextLine();
        System.out.println("Ciao, " + nome + "!");
        //prova commit terminale
    }
}


