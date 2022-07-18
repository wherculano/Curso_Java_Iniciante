package br.edu.fiap.banco;

public class Teste {
	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.depositar(1000);
		conta.sacar(100);

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(1000);
		contaCorrente.sacar(100);
		
		// Conta: variável de controle. ContaCorrente: Objeto.
		Conta conta_2 = new ContaCorrente();
		conta_2.depositar(1000);
		conta_2.sacar(100); // metodo do objeto.
		
		System.out.println("Saldo Conta: R$" + conta.getSaldo());
		System.out.println("Saldo Conta Corrente: R$" + contaCorrente.getSaldo());
		System.out.println("Saldo Conta 2: R$" + conta_2.getSaldo());

	}
}
