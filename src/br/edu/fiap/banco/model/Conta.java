package br.edu.fiap.banco.model;

import java.io.Serial;
import java.io.Serializable;

/**
 * Classe que abstrai uma Conta bancária
 * e nenhum objeto poderá criar uma instancia dessa classe.
 *
 * @author Wagner Herculano
 * @version 1.0
 */

public abstract class Conta implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int agencia;
    private int numero;
    protected double saldo;
    private Pessoa titular;
    private static int totalDeContasExistentes = 0;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular.getNome();
    }

    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        Conta.totalDeContasExistentes += 1;
    }

    /**
     * Acrescenta valor ao Saldo da Conta;
     *
     * @param valor que será depositado
     */
    public abstract void depositar(double valor);


    /**
     * Retira um valor do Saldo da Conta
     *
     * @param valor a ser retirado
     * @see this.depositar
     */
    public void sacar(double valor) throws SaldoInsuficienteException{
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo R$:" + this.saldo + ", Valor R$:" + valor);
        }else if (valor <= 0){
            throw new ValorInvalidoException("Impossível sacar valor inferior a R$1. " + "Valor: R$" + valor);
        }
        this.saldo -= valor;
    }

    /**
     * Efetua transferencia de valores entre Contas
     *
     * @param valor   a ser transferido
     * @param destino Conta para onde vai o valor
     */
    public void transferir(double valor, Conta destino) throws SaldoInsuficienteException{
        this.sacar(valor);
        destino.depositar(valor);
    }

    /**
     * Verifica o saldo da Conta
     *
     * @return Valor do Saldo da Conta
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * @return Tptal de contas existentes
     */
    public static int getTotalDeContasExistentes() {
        return Conta.totalDeContasExistentes;
    }

    @Override
    public boolean equals(Object refGenerica){
        Conta outraConta = (Conta) refGenerica;
        if(this.agencia != outraConta.agencia){
            return false;
        }else return this.numero == outraConta.numero;
    }
}
