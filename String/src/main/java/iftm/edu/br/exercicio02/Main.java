package iftm.edu.br.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double custo = scan.nextDouble();
        scan.nextLine();
        String cidade = scan.nextLine();

        if(cidade.equalsIgnoreCase("Uberlandia"))
            System.out.printf("O custo de vida em Uberlandia e R$ %.2f\n",custo);
        else if(cidade.equalsIgnoreCase("brasilia"))
            System.out.printf("O custo de vida em Brasilia e R$ %.2f\n",custo*2);
        else
            System.out.printf("O custo de vida em %s e R$ %.2f\n",cidade,custo/2);
    }
}
