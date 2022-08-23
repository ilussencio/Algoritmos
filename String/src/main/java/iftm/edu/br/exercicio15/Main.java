package exercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String formula = scan.nextLine();
        String partes[] = formula.split(" ");

        if(partes.length != 3){
            System.out.println("Formula invalida.");
        }else {
            double n1 = Double.parseDouble(partes[0]);
            double n2 = Double.parseDouble(partes[2]);

            if(partes[1].equals("+"))
                System.out.println(n1+n2);
            else if(partes[1].equals("-"))
                System.out.println(n1-n2);
            else if(partes[1].equals("*"))
                System.out.println(n1*n2);
            else if(partes[1].equals("/"))
                System.out.println(n1/n2);
            else
                System.out.println("Formula invalida.");
        }
    }
}
