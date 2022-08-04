package br.edu.fiap.banco;

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
    public boolean sacar(double valor) {
        if (this.saldo >= valor && valor > 0) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    /**
     * Efetua transferencia de valores entre Contas
     *
     * @param valor   a ser transferido
     * @param destino Conta para onde vai o valor
     */
    public boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;

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
}
