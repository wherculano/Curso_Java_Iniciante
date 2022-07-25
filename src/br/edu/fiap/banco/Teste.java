package br.edu.fiap.banco;

public class Teste {
	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.depositar(1000);
		conta.sacar(100);
		Pessoa wagner = new Pessoa("Wagner", "111.222.333-44");
		conta.setTitular(wagner);
		System.out.println("Conta -> " + conta.getTitular());

		ContaCorrente contaCorrente = new ContaCorrente();
		Pessoa herculano = new Pessoa("Herculano", "222.333.444-55");
		contaCorrente.setTitular(herculano);
		System.out.println("ContaCorrente -> " + contaCorrente.getTitular());
		contaCorrente.depositar(1000);
		contaCorrente.sacar(100);

		// Conta: variável de controle. ContaCorrente: Objeto.
		Conta conta_2 = new ContaCorrente();
		conta_2.depositar(1000);
		conta_2.sacar(100); // metodo do objeto.

		System.out.println("Saldo Conta: R$" + conta.getSaldo());
		System.out.println("Saldo Conta Corrente: R$" + contaCorrente.getSaldo());
		System.out.println("Saldo Conta 2: R$" + conta_2.getSaldo());

		conta.transferir(50, conta_2);
		System.out.println("Saldo Conta: R$" + conta.getSaldo());
//		System.out.println("Saldo Conta Corrente: R$" + contaCorrente.getSaldo());
		System.out.println("Saldo Conta 2: R$" + conta_2.getSaldo());
		
		System.out.println("Total de contas criadas até o momento: " + Conta.getTotalDeContasExistentes());
		

	}
}
