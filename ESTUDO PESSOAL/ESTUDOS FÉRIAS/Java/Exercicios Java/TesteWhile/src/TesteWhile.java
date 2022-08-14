import java.util.Scanner;


public class TesteWhile {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Deseja continuar? Digite 1 para sim e 2 para sair");
		int caracter = myObj.nextInt();
		
			
		while(caracter == 1) {
			System.out.println("Dentro da instrução while!");
			caracter = myObj.nextInt();
		}
			
	}

}
