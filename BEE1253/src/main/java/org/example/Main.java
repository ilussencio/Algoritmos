package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int quant = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < quant; i ++){
            StringBuilder frase = new StringBuilder(scan.nextLine());
            int n = scan.nextInt();
            scan.nextLine();
            StringBuilder cifra = new StringBuilder();

            for(int j = 0; j < frase.length(); j++){
                if(frase.charAt(j) == 'Z')
                    cifra.append('A');
                else
                    cifra.append(Character.toString(frase.charAt(j)+n));
            }
            System.out.println(cifra);
        }
        scan.close();
    }
}