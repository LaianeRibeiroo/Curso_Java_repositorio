package entities;

public class produto {
	private String name; 
	
	public String getName() {
		return name;
	}
	public produto(String name, double valor) {
		this.name = name;
		this.valor = valor;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	private double valor; 
	

}
