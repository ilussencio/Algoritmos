package org.example.Exercicio04;

import java.util.Collection;

public class Aluno {
    private String nome;
    private Collection<String> email;
    private Collection<String> telefone;

    public Aluno(){}
    public Aluno(String nome, Collection<String> email, Collection<String> telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
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

    public Collection<String> getTelefone() {
        return telefone;
    }

    public void setTelefone(Collection<String> telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", email=" + email +
                ", telefone=" + telefone +
                '}';
    }
}
