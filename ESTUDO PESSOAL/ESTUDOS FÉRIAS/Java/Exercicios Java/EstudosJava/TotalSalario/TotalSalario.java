//Faça um programa par ler o salário de 5 funcionarios de uma empresa. Apresente no final o algoritmo o total que a empresa deve pagar de salário.

import java.util.Scanner;

public class TotalSalario {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		double totalSalario = 0;
		
		for(int funcionario = 0; funcionario < 5; funcionario++) {
			
			System.out.println("Informe o salario do " + (funcionario + 1) + "º funcionario: ");
			double salarioFuncionario = myObj.nextDouble();
			
			totalSalario = totalSalario + salarioFuncionario;
			
		}
		
		System.out.println("A soma do salario dos 5 funcionarios é de: R$" + totalSalario);

	}

}
