import java.util.Scanner;

public class AguaPorPeso {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Digite seu peso: ");
		float aguaPorKg = 0.04f;
		float peso = myObj.nextFloat();
		float formula = (aguaPorKg * peso);
		double litroPorPeso = (Math.round(formula*10.0)/10.0);
		
		System.out.println("Você deve beber " + litroPorPeso + " litros de água por dia.");
		
	}

}
