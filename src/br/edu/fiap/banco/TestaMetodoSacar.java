package br.edu.fiap.banco;

public class TestaMetodoSacar {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321, 500.0);
        try {
            conta.sacar(100);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(conta.getSaldo());
    }

}
