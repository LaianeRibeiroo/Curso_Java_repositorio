package Exercicios_Modulo_54;

import java.util.Scanner;

public class M54_07 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
	    int i=1,d=0,t=0;
	    
	    for (i=1;i<=num;i++) {
	    	d = 2*i;
	    	t = 3*i;
	    	System.out.printf("%d %d %d %n", i, d, t);
	    	    }
	    		
		
		

	}

}
