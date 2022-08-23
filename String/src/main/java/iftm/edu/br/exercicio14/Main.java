package exercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        String aux = texto.replace('a','@').replace('A', '@');
        String auxSplit[] = aux.split(" ");
        if( auxSplit.length < 3) {
            System.out.println("Frase invalida.");
        }else {
            System.out.println(aux);

            if (auxSplit[0].compareTo(auxSplit[auxSplit.length - 1]) == 0)
                System.out.println("palavra1 == palavra2");
            else if (auxSplit[0].compareTo(auxSplit[auxSplit.length - 1]) > 0)
                System.out.println("palavra1 > palavra2");
            else
                System.out.println("palavra1 < palavra2");

        }
        scan.close();
    }
}
