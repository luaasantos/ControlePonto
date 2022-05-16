package br.edu.fatecmm.projetoenum;

public class Gerente extends Funcionario{
    private String login;
    private String senha;

    public Gerente(int idFunc, String nome, String email, String doc, String login, String senha) {
        super(idFunc, nome, email, doc);
        this.login = login;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Gerente" +
                "\nLogin: " + login +
                "\nSenha: " + senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
