package com.ilussencio.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int quant = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < quant; i ++){
            list.add(scan.nextLine());
        }

        list.remove(scan.nextInt()-1);

        for(String nome:list){
            System.out.println(nome);
        }

        scan.close();
    }
}
