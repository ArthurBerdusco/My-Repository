//Faça um programa para ler as idades de 6 jogadores de três times de futsal. Apresente no final o jogador mais velho e o mais novo do time.

import java.util.Scanner;

public class TimesDeFutebol {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		int maisNovo = 0;
		int maisVelho = 0 ;
		
		for(int time = 0; time < 3; time++) {
			System.out.println("\nTime nº " + (time + 1));
			
			for(int jogador = 0; jogador < 6; jogador++) {
				System.out.println("Digite a idade do " + (jogador + 1)+ "º jogador: ");
				int idadeJogador = myObj.nextInt();
				
				if((time == 0) & (jogador == 0)) {
					maisNovo = idadeJogador;
					maisVelho = idadeJogador;
				}else {
					if(idadeJogador < maisNovo) {
						maisNovo = idadeJogador;
					}
					
					if(idadeJogador > maisVelho) {
						maisVelho = idadeJogador;
					}
					
				}
			}
			
		}
		System.out.println("O jogador mais novo dos 3 times tem " + maisNovo + " anos.");
		System.out.println("O jogador mais velho dos 3 times tem " + maisVelho + " anos.");
	}

}
