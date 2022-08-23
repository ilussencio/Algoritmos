package exercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        String busca = scan.nextLine();
        String aux[] = frase.split(" ");
        int count = 0;

        for( int i = 0; i < aux.length; i++){
            if(aux[i].contains(busca)){
                count ++;
            }
        }

        System.out.println(count);

    }
}
