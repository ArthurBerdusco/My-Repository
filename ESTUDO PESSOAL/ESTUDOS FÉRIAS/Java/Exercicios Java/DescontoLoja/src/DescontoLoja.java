import java.util.Scanner;


public class DescontoLoja {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Valor do proguto: ");
			int valorProduto = myObj.nextInt();
			
			if(valorProduto < 100) {
				System.out.println("Não tem desconto.");
			}else if(valorProduto < 200) {
				System.out.println("10% desconto");
			}else if(valorProduto >= 200) {
				System.out.println("20% desconto");
			}	
		}
	}
}
