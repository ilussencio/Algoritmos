package org.example.Exercicio02;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] iftm){
        Scanner scan = new Scanner(System.in);
        String email;
        String nome = scan.nextLine();
        HashSet<String> emails = new HashSet<>();

        email = scan.nextLine();
        while(!email.equals("@")){
            emails.add(email);
            email = scan.nextLine();
        }

        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEmail(emails);

        System.out.println(cliente.getEmail().size());
        scan.close();
    }
}


