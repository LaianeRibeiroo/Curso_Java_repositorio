package Exercicios_Modulo_37;
import java.io.IOException;
 import java.util.Scanner;

public class Exercicios_M30 {
 
    public static void main(String[] args) throws IOException {
 
     	Scanner sc = new Scanner(System.in);
		int x, y, soma;
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;

		System.out.println("SOMA = " + soma);

		sc.close();
 
    }
 
}