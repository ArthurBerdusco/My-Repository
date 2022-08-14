import java.util.Scanner;
public class PesagemUfc {

	public static void main(String[] args) {
		
		while(true) {
			Scanner myObj = new Scanner(System.in);
			
			System.out.println("Digite o peso do atleta: ");
			
			float peso = myObj.nextFloat();
			
			if((peso >= 70 ) & (peso <=80)) {
				System.out.println("O atleta bateu o peso!");
			}else {
				System.out.println("O atleta não bateu o peso!");
			}
			
			
			
		}

	}

}
