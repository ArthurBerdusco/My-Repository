//Monte um programa que leia N números, até que seja digitado um número <= 0.
//Apresente no final a quantidade de números lidos.

import java.util.Scanner;

public class LerNumeros {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("Digite um número: ");
			int numero = myObj.nextInt();
			
			int qtdNumDigitados = 0;
			while(numero >= 0) {
				
				qtdNumDigitados = (qtdNumDigitados + 1);
				System.out.println("Digite outro número: ");
				numero = myObj.nextInt();
				
			}
			System.out.println("Você digitou " + qtdNumDigitados + " numeros.");
			
		}

	}

}
