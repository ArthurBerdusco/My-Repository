import java.util.Scanner;


public class TesteInput {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Digite o ano que você nasceu: ");
		int anoNascimento = myObj.nextInt();
		int idade = (2022 - anoNascimento);
		
		System.out.println("Você tem " + idade + " anos.");

	}

}
