package br.edu.fiap.banco.tests;

import br.edu.fiap.banco.model.Conta;
import br.edu.fiap.banco.model.ContaCorrente;
import br.edu.fiap.banco.model.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;
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
            System.out.println(cc.getTitular().getNome() + " -> " + cc);
        }

        //lambda function que substitui o uso da classe NumeroDaAgenciaComparator (deletada. Estava no commit anterior)
        listaContas.sort((Conta c1, Conta c2) -> Integer.compare(c1.getAgencia(), c2.getAgencia()));

        //lambda function que substitui o uso da classe  TitularDaContaComparator (deletada. Estava no commit anterior)
        Comparator<Conta> comp = (Conta c1, Conta c2) -> {
            String nomeTitular1 = c1.getTitular().getNome();
            String nomeTitular2 = c2.getTitular().getNome();
            return nomeTitular1.compareTo(nomeTitular2);
        };
//        listaContas.sort(comp);

        System.out.println("----------".repeat(6));

        listaContas.forEach((conta) -> System.out.println(conta.getTitular().getNome() + " -> " + conta));
    }
}
