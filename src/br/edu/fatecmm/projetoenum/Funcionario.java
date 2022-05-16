package br.edu.fatecmm.projetoenum;

public class Funcionario {
    private int idFunc;
    private String nome;
    private String email;
    private String doc;

    public Funcionario(int idFunc, String nome, String email, String doc) {
        this.idFunc = idFunc;
        this.nome = nome;
        this.email = email;
        this.doc = doc;
    }

    @Override
    public String toString() {
        return "Funcionario:\n" +
                "ID: " + idFunc +
                "\nNome: " + nome +
                "\nEmail: " + email +
                "\nDocumento: " + doc;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
}
