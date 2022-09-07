package com.ilussencio;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder str1,str2;
        int i,x,j;
        int quant = scan.nextInt();
        for( j = 0; j < quant; j ++){
            str1 = new StringBuilder(scan.next());
            str2 = new StringBuilder(scan.next());

            StringBuilder newString = new StringBuilder();
            while(!(str1.isEmpty() && str2.isEmpty())){
                if(!str1.isEmpty()) {
                    newString.append(str1.charAt(0));
                    str1.deleteCharAt(0);
                }
                if(!str2.isEmpty()){
                    newString.append(str2.charAt(0));
                    str2.deleteCharAt(0);
                }
            }
            System.out.println(newString);
        }
    }
}