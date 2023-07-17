//Esercitazione di oggi: Java Palindrome
//Nome repo: java-palindrome
//  Consegna: scrivere un programma che chiede all’utente di inserire una parola e gli risponde se è una parola palindroma oppure no
// :lente_a_destra:Una parola palindroma è una parola che si può leggere sia da sinistra verso destra che da destra verso sinistra e mantiene stesso suono e lo stesso significato. Ad esempio: OTTO, RADAR, ESOSE
// BONUS: nello stesso progetto aggiungere le classi per risolvere Snack8 e Snack9 che non abbiamo ancora corretto in classe

package org.java.lessons;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci una parola:");
        String parolaUtente = scan.nextLine();
        char[] lettere = parolaUtente.toCharArray();
        char[] lettereInverso = new char[lettere.length];
        boolean IsThisPalindrome = false;
        System.out.println(Arrays.toString(lettere));

        for (int i = lettere.length - 1, j = 0; i >= 0; i--, j++) {
            lettereInverso[j] = lettere[i];
        }

        for (int i = 0; i < lettereInverso.length; i++) {
            if (lettereInverso[i] != lettere[i]) {
                IsThisPalindrome = false;
                break;
            } else{
                IsThisPalindrome = true;
            }
        }

        if (IsThisPalindrome) {
            System.out.println("La parola " + parolaUtente + " è palindroma");
        } else {
            System.out.println("La parola " + parolaUtente + " non è palindroma");
        }

        System.out.println(Arrays.toString(lettereInverso));

    }
}


