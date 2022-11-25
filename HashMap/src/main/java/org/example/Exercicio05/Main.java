package org.example.Exercicio05;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        String sigla, estado;
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < n; i ++){
            sigla = scan.nextLine();
            estado = scan.nextLine();
            map.put(sigla,estado);
        }

        n = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < n; i ++){
            sigla = scan.nextLine();
            System.out.println(map.get(sigla));
        }
        scan.close();
    }
}
