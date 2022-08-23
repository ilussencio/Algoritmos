package exercicio12;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        String aux[] = texto.split(" ");

        for(int i = 0; i < aux.length; i ++){
            if(aux[i].length() > 3){
                System.out.println(aux[i].substring(0,3));
            }
        }
        scan.close();
    }
}
