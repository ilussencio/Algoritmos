package iftm.edu.br;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for( int i = 0 ; i < n; i++ ){
            String a = scan.next();
            String b = scan.next();

            if( a.endsWith(b))
                System.out.println("encaixa");
            else
                System.out.println("nao encaixa");
        }
        scan.close();
    }
}