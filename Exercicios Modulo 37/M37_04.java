package Exercicios_Modulo_37;
// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;

public class M37_04 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int hini = sc.nextInt();
        int hfim = sc.nextInt();
        int duracao; 
        
        if (hini < hfim) {
        	duracao = hfim-hini;
        }
        else {
        	duracao = 24 - hini + hfim;
        }
        
        System.out.println("O JOGO DUROU " + duracao + " HORAS");
        
    	sc.close(); 
	}

}
