package br.edu.fiap.banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta bancária
 * 
 * @author Wagner Herculano
 * @version 1.0
 */

public class Conta implements Serializable {
	private static final long serialVersionUID = 1L;
	private int agencia;
	private int numero;
	private double saldo;

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

	public Conta() {
	}

	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	/**
	 * Acrescenta valor ao Saldo da Conta;
	 * 
	 * @param valor que será depositado
	 */
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	/**
	 * Retira um valor do Saldo da Conta
	 * 
	 * @param valor
	 * @see depositar
	 */
	public void sacar(double valor) {
		if(this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
		}
	}

	/**
	 * Verifica o saldo da Conta
	 * 
	 * @return Valor do Saldo da Conta
	 */
	public double getSaldo() {
		return this.saldo;
	}
}
