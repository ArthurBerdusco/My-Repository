import java.util.Scanner;
public class CategoriaUfc {

	public static void main(String[] args) {
		while(true) {
			
			Scanner myObj = new Scanner(System.in);
			
			System.out.println("Peso do atleta: ");
			float pesoAtleta = myObj.nextFloat();
			
			if(pesoAtleta < 60) {
				System.out.println("Peso Leve.");
			}else if ((pesoAtleta >= 60) & (pesoAtleta < 82)) {
				System.out.println("Peso Médio.");
			}else if(pesoAtleta >= 82){
				System.out.println("Peso Pesado.");
			}
			
		}

	}

}
