package iftm.edu.br.exercicio08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        String cripto = "";

        for(int i = 0; i < frase.length();i++){
            if(frase.charAt(i) == ' '){
                cripto += ' ';
            }else{
                cripto +=   Character.toString(frase.charAt(i)+3);
            }
        }
        System.out.println(cripto);
    }
}
