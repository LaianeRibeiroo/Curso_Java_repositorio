package Exercicios_Modulo_37;
//Exercicio 01 
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
import java.util.Scanner;
public class Exercicios_M37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);

		int Num = sc.nextInt();
	    
		if (Num < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
	}

}

