package program;

import java.util.Locale;
import java.util.Scanner;

import entities.produto;

public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner (System.in);
		int n = sc.nextInt(); 
        produto [] vect = new produto [n]; 
         for (int i=0; i<n;i++) {
        	sc.nextLine();
        	String name= sc.nextLine(); 
        	double valor = sc.nextDouble();
        	vect [i] = new produto (name,valor); 
         }
        
        double soma = 0.0;
        for (int i=0;i<n;i++) {
        	soma += vect[i].getValor();
        }
        double media = soma/n;
        
        System.out.printf("Média =  %.2f%n", media );
        
        
        
        
        
        sc.close();
	}

}
