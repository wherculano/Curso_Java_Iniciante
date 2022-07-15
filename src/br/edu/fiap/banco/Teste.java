package br.edu.fiap.banco;

public class Teste {
	public static void main(String[] args) {
		Conta contaCorrente = new Conta();
		contaCorrente.saldo = 50.0;
		contaCorrente.agencia = 123;
		contaCorrente.numero = 321;

		contaCorrente.depositar(1000);
		System.out.println(contaCorrente.verificarSaldo());
		
		Conta contaPoup = new Conta(111, 222, 1000);
		contaPoup.sacar(50);
		System.out.println(contaPoup.verificarSaldo());
		
	
	
	}
}
