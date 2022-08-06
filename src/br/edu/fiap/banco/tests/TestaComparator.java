package br.edu.fiap.banco.tests;

import br.edu.fiap.banco.model.Conta;
import br.edu.fiap.banco.model.NumeroDaAgenciaComparator;
import br.edu.fiap.banco.model.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TestaComparator {
    public static void main(String[] args) {
        List<Conta> listaContas = new ArrayList<>();

        Conta cc1 = new ContaCorrente(753, 456, 0.0);
        Conta cc2 = new ContaCorrente(123, 456, 100.0);
        Conta cc3 = new ContaCorrente(159, 457, 1000.0);

        listaContas.add(cc1);
        listaContas.add(cc2);
        listaContas.add(cc3);

        for (Conta cc : listaContas) {
            System.out.println(cc);
        }

        NumeroDaAgenciaComparator comparator = new NumeroDaAgenciaComparator();
        listaContas.sort(comparator);

        System.out.println("----------".repeat(6));

        for (Conta cc : listaContas) {
            System.out.println(cc);
        }
    }

}
