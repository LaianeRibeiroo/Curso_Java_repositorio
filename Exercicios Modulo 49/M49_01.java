package Exercicios_Modulo_49;

import java.util.Scanner;

public class M49_01 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in); 
	int num = sc.nextInt();
	
	while (num != 2002) {
		
		System.out.println("Senha Invalida"); 
		num = sc.nextInt();
	}
	System.out.println("Acesso Permitido"); 
	sc.close();
	}

}
