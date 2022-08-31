import java.util.Scanner;


public class Radar {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		
		
		while(true) {
			
			System.out.println("Digite a velocidade do veículo: ");
			
			int velocidade = myObj.nextInt();
			
			if(velocidade >= 50) {
				System.out.println("Multado!");
			}else {
				System.out.println("Dentro do limite da via.");
			}
			
		}
		

		
		
	}

}
