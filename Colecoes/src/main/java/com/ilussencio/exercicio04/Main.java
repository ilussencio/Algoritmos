package com.ilussencio.exercicio04;

import com.ilussencio.exemplo01.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        do{
            imprimeMenu();
            int op = scan.nextInt();
            if(op == 1)
                inserirContato();
            else if(op == 2)
                listarContato();
            else
                break;
        }while (true);
        System.out.println("Obrigado! Volte Sempre!");
        scan.close();
    }
    static List< Contato<String> > contatos = new ArrayList<>();

    public static void listarContato(){
        for(Contato contato:contatos){
            System.out.println(contato);
        }
    }

    public static void inserirContato(){
        Scanner sc = new Scanner(System.in);
        Contato<String> contato = new Contato<>();

        System.out.println("CRIAR UM NOVO CONTATO");
        System.out.printf("Nome: ");
        contato.setNome(sc.nextLine());
        System.out.printf("Telefone: ");
        contato.setCelular(sc.nextLine());
        System.out.printf("Celular: ");
        contato.setTelefone(sc.nextLine());
        System.out.printf("E-mail: ");
        contato.setEmail(sc.nextLine());
        contatos.add(contato);
        System.out.println("CONTATO CADASTRADO COM SUCESSO!");
    }

    public static void imprimeMenu(){
        System.out.println("----- MENU -----");
        System.out.println("1 - INSERIR CONTATO");
        System.out.println("2 - LISTAR CONTATOS");
        System.out.println("3 - SAIR");
    }
}
