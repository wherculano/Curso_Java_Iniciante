package br.edu.fiap.banco.model;

import java.util.Comparator;

public class TitularDaContaComparator implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeTitular1 = c1.getTitular().getNome();
        String nomeTitular2 = c2.getTitular().getNome();
        return nomeTitular1.compareTo(nomeTitular2);
    }
}
