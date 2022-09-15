package com.ilussencio.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<String> frases = new ArrayList<>();
        StringBuilder string = new StringBuilder();
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < n; i ++){
            frases.add(scan.nextLine());
        }

        for(String frase:frases){
            string.append(frase.split(" ")[0].toUpperCase());
            string.append(" ");
        }
        System.out.println("Total de frases : "+(n+1));
        System.out.println(string);
    }
}
