package compararNumero3;

import java.util.Scanner;

public class compararNumeroV3 {

	public static void main(String[] args) {
	 
		Scanner leitor = new Scanner (System.in);
		
		double a, b, c, maior;

		System.out.print("Digite o Numero 1: ");
		a = leitor.nextDouble();

		System.out.print("Digite o Numero 2: ");
		b = leitor.nextDouble();

		System.out.print("Digite o Numero 3: ");
		c = leitor.nextDouble();

		leitor.close();
		
		if (a > b && a > c ) {			
			System.out.println(" o Número maior é: " + a );
			
		} else if (b > c){
			System.out.println(" o Número maior é: " + b );
			
		} else {
			System.out.println(" o Número maior é: " + c );
			
		}
		if (a < b) {
			System.out.println(" o Número menor é: " + a );
		}else {
			System.out.println(" o Número maior é: " + b );
		}
	}
}
