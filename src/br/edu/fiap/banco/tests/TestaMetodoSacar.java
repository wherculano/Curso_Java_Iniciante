package br.edu.fiap.banco.tests;

import br.edu.fiap.banco.model.Conta;
import br.edu.fiap.banco.model.ContaCorrente;
import br.edu.fiap.banco.model.SaldoInsuficienteException;

public class TestaMetodoSacar {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321, 500.0);
        try {
            conta.sacar(100);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(conta.getSaldo());
    }

}
