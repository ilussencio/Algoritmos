package com.ilussencio.exemplo01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static double media(ArrayList<Aluno> alunos){
        double soma = 0;
        for(int i = 0; i < alunos.size(); i ++){
            soma += alunos.get(i).getNota();
        }
        return (double) soma / alunos.size();
    }

    public static void main(String[] args){
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Lucas Silva", 10));
        alunos.add(new Aluno("Mariana Melo", 10));
        alunos.add(new Aluno("Joao", 10));
        alunos.add(new Aluno("Patricia Santiago", 10));

        System.out.println(alunos.toString());

        System.out.println(media(alunos));

    }
}
