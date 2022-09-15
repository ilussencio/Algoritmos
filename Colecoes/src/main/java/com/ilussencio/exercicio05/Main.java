package com.ilussencio.exercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scan.nextInt();
        for(int i = 0; i < n; i ++){
            list.add(scan.nextInt());
        }

        for(int i = list.size()-1; i >= 0; i--){
            if(list.get(i) < 0){
                System.out.println(list.get(i));
            }
        }
        scan.close();
    }
}
