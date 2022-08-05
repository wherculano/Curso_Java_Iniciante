package br.edu.fiap.banco.tests;

import br.edu.fiap.banco.model.ContaCorrente;

public class TestaIgualdadeDeContas {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(123, 456, 0.0);
        ContaCorrente cc2 = new ContaCorrente(123, 456, 100.0);
        ContaCorrente cc3 = new ContaCorrente(123, 457, 1000.0);

        boolean ehIgual = cc1.equals(cc2);
        System.out.println("As contas são iguais? -> " + ehIgual);

        boolean naoIgual = cc1.equals(cc3);
        System.out.println("As contas são iguais? -> " + naoIgual);

    }
}
