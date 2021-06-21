package Exercicios_Modulo_37;
import java.util.Scanner;
public class M37_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
	    
		if (N1 % N2 == 0 || N2 % N1 == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não São multiplos");
		}

		sc.close();
}
	

}
