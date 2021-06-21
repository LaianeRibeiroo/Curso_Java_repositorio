package Application;

import java.util.Locale;
import java.util.Scanner;

import cauculator.CurrencyConverte;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner (System.in); 
		System.out.println("Informe o valor do Dollar:   ");
        double dollar = sc.nextDouble();
        System.out.println("Informe quantos Reais deseja converter:   ");
        double vreais = sc.nextDouble();
        double resultado = CurrencyConverte.convert(dollar, vreais);
        System.out.printf ("Valor total a pagar:    %.2f%n", resultado);
        
	}

}
