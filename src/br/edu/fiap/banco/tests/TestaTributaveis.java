package br.edu.fiap.banco.tests;

import br.edu.fiap.banco.model.CalculadorDeImposto;
import br.edu.fiap.banco.model.ContaCorrente;
import br.edu.fiap.banco.model.SeguroDeVida;

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
