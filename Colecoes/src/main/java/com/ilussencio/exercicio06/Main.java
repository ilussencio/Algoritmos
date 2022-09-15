package com.ilussencio.exercicio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scan.nextInt();
        for(int i = 0; i < n; i ++){
            int numero = scan.nextInt();
            if(numero%2 == 0){
                list.add(numero);
            }
        }
        for(int numero : list){
            System.out.println(numero);
        }
        System.out.println(list.size());
        scan.close();
    }
}
