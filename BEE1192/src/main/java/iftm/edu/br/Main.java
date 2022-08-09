package iftm.edu.br;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1,n2;
        int quant = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < quant; i++){
            String string = scan.nextLine();

            n1 = Character.getNumericValue(string.charAt(0));
            n2 = Character.getNumericValue(string.charAt(2));

            if( n1 == n2){
                System.out.println(n1*n2);
            }else if( Character.isUpperCase(string.charAt(1)) ){
                System.out.println(n2-n1);
            }else{
                System.out.println((n1+n2));
            }
        }
        scan.close();
    }
}