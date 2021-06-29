package entities;

public class conta {
	private int number;
	private String nome; 
	private double valor;
	
	public conta(int number, String nome, double valorinicial) {
			this.number = number;
		this.nome = nome;
		deposito (valorinicial);
	}

	public conta(int number, String nome) {
		this.number = number;
		this.nome = nome;
	}

	public int getNumber() {
		return number;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	
	public void deposito (double transacao) {
		 valor += transacao;
		
	}
	public void saque (double transacao) {
		valor -= transacao + 5.0; 
	}
	
    public String toString() {
    	return "Numero da conta: "
    	+ number
    	+ ", Nome:"
    	+ nome
    	+ ", Saldo: R$"
    	+ String.format("%.2f", valor);
    }
}
