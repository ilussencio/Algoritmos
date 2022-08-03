package iftm.edu.br.exercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        int count[] = new int[6];

        for(int i = 0; i < frase.length(); i++){
            switch (frase.toLowerCase().charAt(i)){
                case 'a':
                    count[1] ++;
                    count[0] ++;
                    break;
                case 'e':
                    count[2] ++;
                    count[0] ++;
                    break;
                case 'i':
                    count[3] ++;
                    count[0] ++;
                    break;
                case 'o':
                    count[4] ++;
                    count[0] ++;
                    break;
                case 'u':
                    count[5] ++;
                    count[0] ++;
                    break;
            }
        }

        System.out.println("Total = "+count[0]);
        System.out.println("a = "+count[1]);
        System.out.println("e = "+count[2]);
        System.out.println("i = "+count[3]);
        System.out.println("o = "+count[4]);
        System.out.println("u = "+count[5]);
    }
}
