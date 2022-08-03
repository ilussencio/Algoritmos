package iftm.edu.br.exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();

        if(texto.length() <= 10)
            System.out.println("pequeno");
        else
            System.out.println("grande");
    }
}
