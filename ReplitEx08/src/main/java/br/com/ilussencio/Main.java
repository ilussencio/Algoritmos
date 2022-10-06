package br.com.ilussencio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            lista1.add(scan.nextLine());
        }
        n = scan.nextInt();
        for(String str : lista1){
            if(str.length() <= n){
                lista2.add(str);
            }
        }
        lista1.removeAll(lista2);
        System.out.println("Lista 1 : "+lista1.size());
        System.out.println("Lista 2 : "+lista2.size());
    }
}