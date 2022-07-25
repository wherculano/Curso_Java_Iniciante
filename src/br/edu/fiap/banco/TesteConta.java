package br.edu.fiap.banco;

public class TesteConta {
	public static void main(String[] args) {

		Conta conta = new Conta(12, 1234, 1000.10);
		conta.sacar(100);

		Pessoa wagner = new Pessoa("Wagner", "111.222.333-44");
		conta.setTitular(wagner);

		System.out.println("Conta -> " + conta.getTitular());
		System.out.println("Saldo Conta: R$" + conta.getSaldo());
		System.out.println("Total de contas criadas até o momento: " + Conta.getTotalDeContasExistentes());

	}
}
