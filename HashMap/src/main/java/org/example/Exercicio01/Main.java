package org.example.Exercicio01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] iftm){
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        String[] arrayFrase = frase.toLowerCase().split(" ");
        Set<String> map = new HashSet<>();

        for(int i = 0; i < arrayFrase.length; i ++){
            map.add(arrayFrase[i]);
        }
        System.out.println(map.size());
    }
}
