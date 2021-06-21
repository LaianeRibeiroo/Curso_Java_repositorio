package Exercicios_Modulo_37;
//Exercicio 02
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
import java.util.Scanner;
public class M37_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
			Scanner sc = new Scanner(System.in);

			int Num = sc.nextInt();
		    
			if (Num % 2 == 0) {
				System.out.println("PAR");
			}
			else {
				System.out.println("IMPAR");
			}

			sc.close();
	}

}
