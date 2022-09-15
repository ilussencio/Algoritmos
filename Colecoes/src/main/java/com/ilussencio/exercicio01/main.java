package com.ilussencio.exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i <= 4; i ++){
            list.add(scan.nextLine());
        }

        Collections.reverse(list);

        for(String nome : list){
            System.out.println(nome);
        }

        scan.close();
    }
}
