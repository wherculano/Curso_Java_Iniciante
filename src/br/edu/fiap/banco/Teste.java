package br.edu.fiap.banco;

public class Teste {
	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(1000);
		contaCorrente.sacar(100);

		contaCorrente.setAgencia(1111);
		contaCorrente.setNumero(1234);
		contaCorrente.setChequeEspecial(1000);
		contaCorrente.setTipo("PF");

		System.out.println("Agencia: " + contaCorrente.getAgencia());
		System.out.println("Conta: " + contaCorrente.getNumero());
		System.out.println("Tipo: " + contaCorrente.getTipo());
		System.out.println("Valor cheque especial: R$" + contaCorrente.getChequeEspecial());

	}
}
