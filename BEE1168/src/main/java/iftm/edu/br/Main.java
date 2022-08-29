package iftm.edu.br;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int quant = scan.nextInt();
        int count = 0;
        String numero;

        scan.nextLine();


        for(int i = 0; i < quant; i++){
            numero = scan.nextLine();
            String array[] = numero.split("");

            for(int j = 0; j <= array.length -1; j ++){

                switch (array[j].charAt(0)){
                    case '1':
                        count += 2;
                        break;
                    case '2':
                        count += 5;
                        break;
                    case '3':
                        count += 5;
                        break;
                    case '4':
                        count += 4;
                        break;
                    case '5':
                        count += 5;
                        break;
                    case '6':
                        count += 6;
                        break;
                    case '7':
                        count += 3;
                        break;
                    case '8':
                        count += 7;
                        break;
                    case '9':
                        count += 6;
                        break;
                    case '0':
                        count += 6;
                        break;
                }

            }
            System.out.printf("%d leds\n",count);
            count = 0;
        }
        scan.close();
    }
}