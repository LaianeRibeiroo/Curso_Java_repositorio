package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee em = new Employee ();
		
		System.out.println("Informe o nome, Salario Bruto e imposto");
		em.name = sc.next();
		em.GrossSalary = sc.nextDouble();
		em.tax = sc.nextDouble();
		
		System.out.println(em.name);
		System.out.println(em.GrossSalary);
		System.out.println(em.tax);
		
		System.out.println("Informe a porcentagem de aumento");
		double percentage = sc.nextDouble();
		em.IncreaseSalary(percentage);

		System.out.println();
		System.out.println("Updated data: " + em);
		sc.close();

	}

}
