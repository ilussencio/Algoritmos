package exemplo01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String texto = s.nextLine();

        System.out.println("TEXTO ORIGINAL = " + texto);

        String partes[] = texto.split("/");

        System.out.println("Dia "+ partes[0]);
        System.out.println("Mes "+ partes[1]);
        System.out.println("Ano "+ partes[2]);

        for(int i=0; i < partes.length; i++)
            System.out.println("Parte [");

    }
}