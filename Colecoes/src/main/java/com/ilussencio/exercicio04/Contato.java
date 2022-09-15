package com.ilussencio.exercicio04;

public class Contato <I>{
    private String nome;
    private I telefone;
    private I celular;
    private String email;

    public Contato(){}

    public Contato(String nome, I telefone, I celular, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public I getTelefone() {
        return telefone;
    }

    public void setTelefone(I telefone) {
        this.telefone = telefone;
    }

    public I getCelular() {
        return celular;
    }

    public void setCelular(I celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato => " +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", celular=" + celular +
                ", email='" + email + '\'';
    }
}
