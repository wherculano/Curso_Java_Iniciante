package br.edu.fiap.banco.tests;

import br.edu.fiap.banco.model.Conta;
import br.edu.fiap.banco.model.ContaCorrente;

import java.util.ArrayList;

public class TestaIgualdadeDeContas {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(123, 456, 0.0);
        Conta cc2 = new ContaCorrente(123, 456, 100.0);
        Conta cc3 = new ContaCorrente(123, 457, 1000.0);

        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);

        for(Conta cc : contas){
            System.out.println(cc1);
            System.out.println(cc);
            boolean ehIgual = cc1.equals(cc);
            System.out.println("As contas são iguais? -> " + ehIgual);
            System.out.println("-".repeat(60));
        }

        boolean contaEstaNaLista = contas.contains(cc1);
        System.out.println("A conta CC1 está presente na lista de contas? -> " + contaEstaNaLista);
    }
}
