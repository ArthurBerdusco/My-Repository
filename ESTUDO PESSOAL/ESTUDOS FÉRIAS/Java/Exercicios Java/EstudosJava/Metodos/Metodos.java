
public class Metodos {
	
	static void metodoUm() {
		System.out.println("Olá metodo!");
	}
	
	static void metodoDois(String nome) {
		System.out.println("Olá " + nome);
	}
	
	static void metodoTres(String nome, int idade) {
		System.out.println("Olá " + nome + " você tem " + idade + " anos.");
	}
	
	static int metodoQuatro(int num) {
		return 5 + num;
	}
	
	static int metodoCinco(int num1, int num2) {
		return num1 + num2;
	}
	
	static int metodoSeis(int num1, int num2) {
		return num1 + num2;
	}
	
	static void metodoSete(int idade) {
		if(idade < 18) {
			System.out.println("Acesso negado! Você não é maior de idade.");
		}else {
			System.out.println("Acesso permitido! Você é maior de idade.");
		}
	}

	
	
	public static void main(String[] args) {
		
		metodoUm();
		metodoDois("Arthur");
		metodoTres("Carlos", 19);
		System.out.println(metodoQuatro(10));
		System.out.println(metodoCinco(10,10));
		
		int valor = metodoSeis(15,15);
		System.out.println(valor);
		
		metodoSete(17);
		

	}

}


