package br.edu.fatecmm.projetoenum;

public class Secretaria extends Funcionario{
    private String telefone;
    private String ramal;

    public Secretaria(int idFunc, String nome, String email, String doc, String telefone, String ramal) {
        super(idFunc, nome, email, doc);
        this.telefone = telefone;
        this.ramal = ramal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Secretaria" +
                "\nTelefone: " + telefone +
                "\nRamal: " + ramal;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
}
