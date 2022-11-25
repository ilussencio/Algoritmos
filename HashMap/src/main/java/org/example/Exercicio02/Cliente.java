package org.example.Exercicio02;

import java.util.Collection;
import java.util.HashSet;

public class Cliente {
    private String nome;
    private Collection<String> email;
    public Cliente(){}

    public Cliente(String nome, Collection<String> email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<String> getEmail() {
        return email;
    }

    public void setEmail(Collection<String> email) {
        this.email = email;
    }
}
