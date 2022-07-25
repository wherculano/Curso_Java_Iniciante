package br.edu.fiap.banco;

public class ContaCorrente extends Conta {
	private static final long serialVersionUID = 1L;
	private String tipo;
	private double chequeEspecial;
	
	public ContaCorrente(int agencia, int numero, double saldo) {
		super(agencia, numero, saldo);
	}
	
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getChequeEspecial() {
		return this.chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public double getSaldoDisponivel() {
		return super.getSaldo() + this.chequeEspecial;
	}

	@Override
	public boolean sacar(double valor) {
		valor += 0.5;
		if (super.sacar(valor)) {
			return true;
		}
		return false;
	}

}
