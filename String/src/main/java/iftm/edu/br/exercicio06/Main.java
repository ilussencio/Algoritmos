package iftm.edu.br.exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        for(int i = 0; i < frase.length(); i ++)
            System.out.printf("%d - %c\n",i,frase.charAt(i));
    }
}
