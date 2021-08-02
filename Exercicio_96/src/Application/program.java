package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.salario;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<salario> list = new ArrayList<>();
		System.out.println("Informe a quantidade de salários: ");
		int qnt = sc.nextInt();

		for (int i = 0; i < qnt; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.println("ID: ");
			int id = sc.nextInt();
			System.out.print("Name:  ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();

			salario sal = new salario(id, nome, salary);

			list.add(sal);

		}
		System.out.println("Informe o ID do salario que será incrementado: ");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary); // procurando a posição do idsalary dentro da lista - chamando função.
		if (pos == null) {
			System.out.println("Este Id não existe");
		} else {
			System.out.println("Qual a percentagem de aumento? ");
			double percent = sc.nextDouble();
			list.get(pos).aumento(percent);
		}

		System.out.println("Lista de funcionarios ");
		for (salario sal : list) { // para cada salario sal, da lista lst... faça
			System.out.println(sal); // imprimindo o tostring do objeto
		}

		sc.close();
	}

	public static Integer position(List<salario> list, int id) {  // varre toda a lista e verifica se o id esta na lista. 
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}

		}
		return null;

	}
}
