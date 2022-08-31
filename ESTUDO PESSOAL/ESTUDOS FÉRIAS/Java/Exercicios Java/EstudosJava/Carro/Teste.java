import java.util.Scanner;

public class Teste {
	//EX2:
	
	
	static long fibo(int n) {
		if(n < 2) {
			return n;
		} else {
			return fibo(n-1) + fibo(n -2);
		}
	}
	

	public static void main(String[] args) {
		
		//EX1:
		
		Scanner myObj = new Scanner(System.in);
		
		
		System.out.println("Digite a idade do eleitor: ");
		int idadeEleitor = myObj.nextInt();
		
		if(idadeEleitor < 16) {
			System.out.println("Não pode votar.");
		}else if((idadeEleitor == 16) || (idadeEleitor == 17) || (idadeEleitor > 65)) {
			System.out.println("Voto facultativo.");
		}else {
			System.out.println("Voto obrigatório.");
		}
		
		
		
		//CONT EX2
		
		for(int i = 0; i < 20; i++) {
			System.out.println("("+i+"):" +Teste.fibo(i) + "\t");
		}
		
		
		//EX3
		
		int mediaTotal = 0;
		
		System.out.println("Digite a quantidade de notas que você quer armazenar: ");
		int alunos = myObj.nextInt();
		
		System.out.println("Digite a nota do aluno de 0 a 10: ");
		int notasAlunos[] = new int[10];
		
		for(int i = 0; i < alunos; i++) {
			
			do {
				notasAlunos[i] = myObj.nextInt();
			}while (notasAlunos[i] > 10);
		}

		
		for(int i = 0; i < alunos; i++) {
			mediaTotal = (mediaTotal + notasAlunos[i]);
	
		}
		
		mediaTotal = mediaTotal / alunos;
		System.out.println("Média dos alunos: "+ mediaTotal);
		
		int alunosMediaAlta = 0;
		int alunosMediaBaixa = 0;
		
		for(int i = 0; i < alunos; i++) {
			if(notasAlunos[i] > mediaTotal) {
				alunosMediaAlta = alunosMediaAlta +1;
			}else {
				alunosMediaBaixa = alunosMediaBaixa +1;
			}
		}
		
		System.out.println("A quantidade de alunos que ficaram acima da média foi: "+ alunosMediaAlta);
		System.out.println("A quantidade de alunos que ficaram abaixo da média foi: "+ alunosMediaBaixa);
		
		
		
		//EX4;
		
		int listaNumeros[] = new int[100];
		
		int contador = 0;
		
		for(int i = 0; i < 100; i++) {
			
			System.out.println("Digite 1 numero aleatório que não seja negativo: ");
			listaNumeros[i] = myObj.nextInt();
			
			
			if(listaNumeros[i] < 0) {
				break;
			}
			
			contador = contador + 1;

		}

		
		int media = 0;
		
		for(int j = 0; j < contador ; j++) {
			media = (media + listaNumeros[j]);
		}
		
		media = media / contador;
		
		System.out.println("Você digitou " + contador + " números e a média dos números é: " + media);
				
	}

}



