package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	System.out.println("Informe a quantidade de Linhas");
	int l = sc.nextInt();
    
	System.out.println("Informe a quantidade de Colunas");
	int c = sc.nextInt();
					
	int [][] mat = new int [l][c]; 
	
	for (int i=0; i<mat.length; i++) {
		for (int j=0; j<mat [i].length; j++) {
			mat [i][j]= sc.nextInt();
		}
	}
	System.out.println("Informe a ocorrencia de numero");
	int x = sc.nextInt();
	
	for (int i=0; i<mat.length; i++) {
		for (int j=0; j<mat[i].length; j++) {
			if (mat[i][j] == x) {
				System.out.println("Posi��o " + i + "," + j + ":");
				if (j > 0) {
					System.out.println("Esquerda: " + mat[i][j-1]);
				}
				if (i > 0) {
					System.out.println("Cima: " + mat[i-1][j]);
				}
				if (j < mat[i].length-1) {
					System.out.println("Direita: " + mat[i][j+1]);
				}
				if (i < mat.length-1) {
					System.out.println("Abaixo: " + mat[i+1][j]);
				}
			}
		}
	}
	
	
	sc.close();
	}

}
