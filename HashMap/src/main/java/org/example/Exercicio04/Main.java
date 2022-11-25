package org.example.Exercicio04;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] iftm){
        Scanner scan = new Scanner(System.in);
        HashSet<String> emails;
        HashSet<String> telefones;
        HashSet<Aluno> alunos = new HashSet<>();
        String nome, opcao="s", email, telefone;
        int count = 1;

        while (opcao.equalsIgnoreCase("s")){
            emails = new HashSet<>();
            telefones = new HashSet<>();
            System.out.print("Nome do aluno "+count+" : ");
            nome = scan.nextLine();
            do{
                System.out.print("Digite um e-mail : ");
                email = scan.nextLine();
                emails.add(email);
                System.out.print("Deseja cadastrar um novo email? : ");
                opcao = scan.nextLine();
            }while( opcao.equalsIgnoreCase("s") );

           do{
                System.out.print("Digite um telefone : ");
                telefone = scan.nextLine();
                telefones.add(telefone);
                System.out.print("Deseja cadastrar um novo Telefone? : ");
                opcao = scan.nextLine();
            } while(opcao.equalsIgnoreCase("s"));

            Aluno aluno = new Aluno(nome,emails,telefones);
            alunos.add(aluno);
            count ++;

            System.out.println(aluno);
            System.out.print("Deseja cadastrar um novo aluno : ");
            opcao = scan.nextLine();
        }

        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }
}
