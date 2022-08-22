
public class Formulario {
	
	static int somar(int inicio, int fim) {
		if(fim > inicio) {
			
			System.out.println("Recurso " + fim);
			
			return fim + somar(inicio, fim - 1);
		}else {
			System.out.println("Chega..");
			return fim;
		}
	}
	
	
	

	public static void main(String[] args) {

		int result = somar(5,10);
		System.out.println(result);
		
		
	}

}
