package br.edu.fiap.banco.model;

public interface Tributavel {

    double getValorImposto();

    // nao é necessario usar public abstract (antes d interface e antes de double)
    // pois dentro de uma interface isso já fica subentendido
}
