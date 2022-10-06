package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> lista01 = new ArrayList<>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            lista01.add(scan.nextInt());
        }

        System.out.printf("Original : ");
        for(int i = 0; i < lista01.size(); i ++){
            if(! (i == lista01.size()-1) ){
                System.out.printf(lista01.get(i)+"-");
            }else {
                System.out.println(lista01.get(i));
            }
        }
        Collections.sort(lista01);
        System.out.printf("Ordenado : ");
        for(int i = 0; i < lista01.size(); i ++){
            if(! (i == lista01.size()-1) ){
                System.out.printf(lista01.get(i)+"-");
            }else {
                System.out.println(lista01.get(i));
            }
        }
    }
}