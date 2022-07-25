package br.edu.fiap.banco;

public class Teste {
	public static void main(String[] args) {

		Conta conta = new Conta(12, 1234, 1000.10);
		conta.sacar(100);
		Pessoa wagner = new Pessoa("Wagner", "111.222.333-44");
		conta.setTitular(wagner);
		System.out.println("Conta -> " + conta.getTitular());

		ContaCorrente contaCorrente = new ContaCorrente(123, 1234, 1000.0);
		Pessoa herculano = new Pessoa("Herculano", "222.333.444-55");
		contaCorrente.setTitular(herculano);
		System.out.println("ContaCorrente -> " + contaCorrente.getTitular());
		contaCorrente.sacar(100);

		// Conta: variável de controle. ContaCorrente: Objeto.
		Conta conta_2 = new ContaCorrente(456, 9876, 1000.75);
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
