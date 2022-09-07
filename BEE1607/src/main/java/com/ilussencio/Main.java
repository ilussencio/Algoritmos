package com.ilussencio;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int quant = scan.nextInt();
        String stra ,strb;
        int count = 0;

        for(int i = 0; i < quant; i ++){
            stra = scan.next();
            strb = scan.next();
            count = 0;
            for(int j = 0; j < stra.length(); j++){
                char aux = stra.charAt(j);
                while(aux != strb.charAt(j)){
                    if(aux == 122)
                        aux = 97;
                    else
                        aux += 1;
                    count ++;
                }
            }
            System.out.println(count);
        }


    }
}