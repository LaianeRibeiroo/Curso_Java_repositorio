package application;

import java.util.Locale;
import java.util.Scanner;

import entities.notas;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		notas notas = new notas();
		notas.nome = sc.nextLine();
		notas.n1 = sc.nextDouble();
		notas.n2 = sc.nextDouble();
		notas.n3 = sc.nextDouble();
		System.out.printf("FINAL GRADE: %.2f%n", notas.nf());
		if (notas.nf() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", notas.resultadoFinal());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}

}
