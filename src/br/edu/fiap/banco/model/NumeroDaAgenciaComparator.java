package br.edu.fiap.banco.model;

import java.util.Comparator;

public class NumeroDaAgenciaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getAgencia(), c2.getAgencia());
        // Esta comparacao diz que se c1 < c2, retorne -1, se c1 > c2, retorne 1, senao retorne 0
    }
}
