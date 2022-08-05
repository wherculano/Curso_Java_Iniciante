package br.edu.fiap.banco.model;

public class CalculadorDeImposto {

    private double totalImposto;

    public void registrar(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;

    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
