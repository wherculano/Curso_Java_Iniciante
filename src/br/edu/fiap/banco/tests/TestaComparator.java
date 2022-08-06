package br.edu.fiap.banco.tests;

import br.edu.fiap.banco.model.*;

import java.util.ArrayList;
import java.util.List;

public class TestaComparator {
    public static void main(String[] args) {
        List<Conta> listaContas = new ArrayList<>();

        Pessoa wagner = new Pessoa("Wagner", "11122233345");
        Pessoa herculano = new Pessoa("Herculano", "77733355519");
        Pessoa santos = new Pessoa("Santos", "88822244456");

        Conta cc1 = new ContaCorrente(753, 456, 0.0);
        cc1.setTitular(wagner);

        Conta cc2 = new ContaCorrente(123, 456, 100.0);
        cc2.setTitular(herculano);

        Conta cc3 = new ContaCorrente(159, 457, 1000.0);
        cc3.setTitular(santos);

        listaContas.add(cc1);
        listaContas.add(cc2);
        listaContas.add(cc3);

        for (Conta cc : listaContas) {
//            System.out.println(cc);
            System.out.println(cc.getTitular().getNome() + " -> " + cc);
        }

//        NumeroDaAgenciaComparator comparator = new NumeroDaAgenciaComparator();
        TitularDaContaComparator comparator = new TitularDaContaComparator();
        listaContas.sort(comparator);

        System.out.println("----------".repeat(6));

        for (Conta cc : listaContas) {
//            System.out.println(cc);
            System.out.println(cc.getTitular().getNome() + " -> " + cc);
        }
    }

}
