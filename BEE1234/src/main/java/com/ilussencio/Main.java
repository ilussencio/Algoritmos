package com.ilussencio;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String novaFrase = "";
            int aux = 0;
            String frase = scan.nextLine();

            for(int i = 0; i < frase.length(); i ++) {
                if (frase.charAt(i) == 32) {
                    novaFrase += " ";
                } else if (aux % 2 == 0) {
                    novaFrase += Character.toString(frase.charAt(i)).toUpperCase();
                    aux++;
                } else {
                    novaFrase += Character.toString(frase.charAt(i)).toLowerCase();
                    aux++;
                }
            }
            System.out.println(novaFrase);
        }

    }
}