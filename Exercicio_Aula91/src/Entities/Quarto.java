package Entities;

public class Quarto {
  private String nome; 
  private String email;
  private int posicao;

  public Quarto(String nome, String email) {

	this.nome = nome;
	this.email = email;
}

public Quarto(int posicao) {
	this.posicao = posicao;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getPosicao() {
	return posicao;
}

public void setPosicao(int posicao) {
	this.posicao = posicao;
}

@Override
public String toString() {
 return nome + ", " + email;
} 
  

  
  
}
