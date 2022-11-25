package org.example.Exercicio06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] iftm){
        Scanner scan = new Scanner(System.in);
        Map<String, String> dicionario = new HashMap<>();
        String chave, valor;
        int n = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < n; i ++){
            chave = scan.nextLine();
            valor = scan.nextLine();
            dicionario.put(chave,valor);
        }
        String frase = scan.nextLine();
        String[] newFrase = frase.split(" ");

        for(int i = 0; i < newFrase.length; i ++){
            if(dicionario.get(newFrase[i]) != null){
                System.out.print(dicionario.get(newFrase[i]) + " ");
            }else{
                System.out.print(newFrase[i]+ " " );
            }
        }

    }
}
//4
//Udi
//Uberlândia
//Ube
//Uberlândia
//mor
//moro
//nasc
//nasci
//Eu mor em Udi e nasc em outra cidade.