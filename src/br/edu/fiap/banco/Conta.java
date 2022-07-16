package br.edu.fiap.banco;

/**
 * Classe que abstrai uma Conta bancária
 * 
 * @author Wagner Herculano
 * @version 1.0
 */

public class Conta {
	int agencia;
	int numero;
	double saldo;

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
		this.saldo += valor;
	}

	/**
	 * Retira um valor do Saldo da Conta
	 * 
	 * @param valor
	 * @see depositar
	 */
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	/**
	 * Verifica o saldo da Conta
	 * 
	 * @return Valor do Saldo da Conta
	 */
	public double verificarSaldo() {
		return this.saldo;
	}
}
