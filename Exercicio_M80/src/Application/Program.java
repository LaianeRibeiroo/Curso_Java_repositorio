package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		conta Conta;

		System.out.println("Informe o numero da conta:   ");
		int number = sc.nextInt();

		System.out.println("Informe o nome do titular:    ");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.println("Deseja realizar depósito inicial?  (y/n) ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Digite o valor do depósito inicial:  ");
			double depositoinicial = sc.nextDouble();
			Conta = new conta(number, nome, depositoinicial);
		} else {
			Conta = new conta(number, nome);
		}

		System.out.println();
		System.out.println("Conta");
		System.out.println(Conta);
		
		System.out.println();
		System.out.println("Informe o valor do depósito");
        double valordeposito = sc.nextDouble();
        Conta.deposito(valordeposito); 
    	System.out.println("Depósito adicionado ");
    	System.out.println(Conta);
    	
    	System.out.println("Informe o valor do saque");
        double valorsaque = sc.nextDouble();
        Conta.saque(valorsaque); 
    	System.out.println("Saque Realizado ");
    	System.out.println(Conta);
    	
    	
		sc.close();

	}

}
