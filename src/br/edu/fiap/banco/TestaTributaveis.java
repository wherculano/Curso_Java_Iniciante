package br.edu.fiap.banco;

public class TestaTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 444, 100.0);
        SeguroDeVida sv = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registrar(cc);
        calc.registrar(sv);

        System.out.println(calc.getTotalImposto());
    }
}
