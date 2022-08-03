package iftm.edu.br.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        String b = scan.nextLine();

        if(a.equals(b)){
            System.out.println("correto");
        }else{
            System.out.println("incorreto");
        }
    }
}