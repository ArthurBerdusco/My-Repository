//Faça um programa para ler as idades de 6 jogadores de um time de futsal. Apresente no final o jogador mais velho e o mais novo do time.

import java.util.Scanner;

public class JogadoresFutebol {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		int menorIdade = 0, maiorIdade = 0;
		
		for(int jogador = 0; jogador < 6; jogador++) {
			
			System.out.println("Digite a idade do " + (jogador + 1) + " jogador: ");
			int idadeJogador = myObj.nextInt();
			
			if(jogador == 0) {
				menorIdade = idadeJogador;
				maiorIdade = idadeJogador;
			}else {
				if(idadeJogador < menorIdade) {
					menorIdade = idadeJogador;
				}
				if(idadeJogador > maiorIdade) {
					maiorIdade = idadeJogador;
				}
			}
			
		}
		System.out.println("O jogador mais novo tem " + menorIdade + " anos.");
		System.out.println("O jogador mais velho tem " + maiorIdade + " anos.");
		
	}

}
