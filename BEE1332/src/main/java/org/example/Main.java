package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int one(String palavra){
        int count = 0;

        if(palavra.charAt(0) == 'o')
            count += 1;
        if(palavra.charAt(1) == 'n')
            count += 1;
        if(palavra.charAt(2) == 'e')
            count += 1;

        return count;
    }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int quant = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < quant; i ++){

            String palavra = scan.nextLine();

            if(palavra.length() == 5){
                System.out.println(3);
            }else if(one(palavra) >= 2){
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }
        scan.close();
    }
}