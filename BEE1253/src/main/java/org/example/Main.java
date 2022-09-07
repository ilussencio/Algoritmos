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
                char aux = frase.charAt(j);
                for(int k = 0; k < n; k ++){
                    if(aux == 65)
                        aux = 90;
                    else
                        aux -= 1;
                }

                cifra.append(Character.toString(aux));
            }
            System.out.println(cifra);
        }
        scan.close();
    }
}