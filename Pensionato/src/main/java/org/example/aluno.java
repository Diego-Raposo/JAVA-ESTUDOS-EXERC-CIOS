package org.example;

public class aluno {
    private String nome;
    private String email;
    public aluno(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    public aluno(){

    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return  nome + ", " +
                email + '\n';
    }

    public void finalize(){

    }
}
