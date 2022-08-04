package br.edu.fiap.banco;

public class TestaContaCorrente {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(123, 1234, 1000.0);

        Pessoa herculano = new Pessoa("Herculano", "222.333.444-55");
        contaCorrente.setTitular(herculano);

        System.out.println("ContaCorrente -> " + contaCorrente.getTitular() + " -> Saldo: R$" + contaCorrente.getSaldo());
        try {
            contaCorrente.sacar(100);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo Conta Corrente após saque de R$100: R$" + contaCorrente.getSaldo());

        // Conta: variável de controle. ContaCorrente: Objeto.
        Conta conta_2 = new ContaCorrente(456, 9876, 1000.75);

        Pessoa wagner = new Pessoa("Wagner", "333.444.555-66");
        conta_2.setTitular(wagner);
        System.out.println("ContaCorrente 2 -> " + conta_2.getTitular() + " -> Saldo: R$" + conta_2.getSaldo());

        try {
            conta_2.sacar(100); // metodo do objeto.
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Saldo Conta 2 após saque de R$100: R$" + conta_2.getSaldo());

        try {
            double valor = 0.75;
            conta_2.transferir(valor, contaCorrente);
            System.out.println("Saldo Conta 2 após transferencia de R$"+ valor + ": R$" + conta_2.getSaldo());
            System.out.println("Saldo Conta Corrente após deposito de R$"+ valor + ": R$" + contaCorrente.getSaldo());
        } catch (SaldoInsuficienteException | ValorInvalidoException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
