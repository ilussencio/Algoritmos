package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(new Pessoa("Lucas Silva",25));
        pessoas.add(new Pessoa("Patricia Santiago",31));
        pessoas.add(new Pessoa("Professor Bruno", 50));
        pessoas.add(new Pessoa("Hugo Ribeiro", 15));

        System.out.println(pessoas);
        //FOR INTERATIVO
        System.out.println("FOR COM I");
        for(int i = 0; i < pessoas.size();i++){
            System.out.println("\t"+pessoas.get(i).getNome());
        }

        System.out.println("FOR ITERATOR");
        for(Iterator<Pessoa> it = pessoas.iterator(); it.hasNext();){
            Pessoa temp = it.next();
            System.out.println("\t"+temp.getNome());
        }

        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }
    }
}