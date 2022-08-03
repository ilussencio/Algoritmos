package iftm.edu.br.exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();

        if(frase.length() < 5)
            System.out.println("invalida");
        else if(frase.charAt(0) == frase.charAt(frase.length()-1))
            System.out.println("iguais");
        else
            System.out.println("diferentes");

        scan.close();
    }
}
