package br.edu.fatecmm.projetoenum;

public class Operador extends Funcionario{
    private double valorHora;

    public Operador(int idFunc, String nome, String email, String doc, double valorHora) {
        super(idFunc, nome, email, doc);
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cargo: Operador" +
                "\nValor p/ Hora" + valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
