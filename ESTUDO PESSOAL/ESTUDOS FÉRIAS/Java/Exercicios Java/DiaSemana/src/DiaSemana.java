import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		int diaSemana = myObj.nextInt();
		
		
		switch(diaSemana) {
			case 1:
				System.out.println("Hoje é domingo.");
				break;
				
			case 2:
				System.out.println("Hoje é segunda-feira.");
				break;
		
			case 3:
				System.out.println("Hoje é terça-feira.");
				break;
				
			case 4:
				System.out.println("Hoje é quarta-feira.");
				break;
			
			case 5:
				System.out.println("Hoja é quint-feira.");
				break;
				
			case 6:
				System.out.println("Hoje é sexta-feira.");
				break;
				
			case 7:
				System.out.println("Hoje é sabado");
				break;
		}

	}

}
