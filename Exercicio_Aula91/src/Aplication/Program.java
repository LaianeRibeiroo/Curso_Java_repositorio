package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Quarto;

public class Program {

	public static void main(String[] args) {
      
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in); 
	
	Quarto [] vect = new Quarto [10]; 
	System.out.println("Informe Quantos quartos serão alugados? ");
	int n = sc.nextInt(); 
	
	for (int i=0; i<n ; i++) 
	{
		         sc.nextLine();
    	         String nome= sc.nextLine(); 
    	    	 String email = sc.nextLine(); 
    	         int posicao = sc.nextInt();     	
    	         vect [posicao] = new Quarto (nome,email); 
	              }
			
	System.out.println();
	System.out.println("Quartos ocupados :");
	for (int i=0; i<10; i++) {
	if (vect[i] != null) {
	System.out.println(i + ": " + vect[i]);
	}
	}
	
	
	
	sc.close();
		
	}
	}
