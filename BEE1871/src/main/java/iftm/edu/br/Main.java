package iftm.edu.br;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=1, b=1;
        while(true){
           a = scan.nextInt();
           b = scan.nextInt();
           if(a == 0 && b == 0)
               break;
           String num = String.valueOf(a+b);
           System.out.println(num.replace("0",""));
        }
        scan.close();
    }
}