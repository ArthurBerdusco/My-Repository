package custoFralda;

public class custoFralda {

	public static void main(String[] args) {
		int diasMes = 30;
		float custoFralda = 1.1f;
		int fraldaDia = 4;
		
		float custoMensal = (fraldaDia * custoFralda) * diasMes;
		
		System.out.println(custoMensal);

	}

}
