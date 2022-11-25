package org.example.Exercicio03;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] iftm){
        Scanner scan = new Scanner(System.in);
        HashSet<String> map = new HashSet<>();
        String nome;
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < n; i ++){
            nome = scan.nextLine();
            map.add(nome);
        }
        nome = scan.nextLine();
        System.out.println("Textos diferentes : "+map.size());
        System.out.println((map.contains(nome)) ? "Texto localizado" : "Texto não localizado");
    }
}