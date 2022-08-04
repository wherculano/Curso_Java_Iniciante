package br.edu.fiap.banco;

public class TestaMetodoSacar {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321, 500.0);
        conta.sacar(100);
        System.out.println(conta.getSaldo());
    }

}
