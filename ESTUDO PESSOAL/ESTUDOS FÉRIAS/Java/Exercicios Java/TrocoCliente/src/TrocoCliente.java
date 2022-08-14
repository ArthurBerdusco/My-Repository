//Monte um programa para simular o cálculo do troco de um cliente em um caixa de supermercado. O sistema solicitará o valor das compras e o valor do pagamento. Após as entradas dos dados o sistema deve apresentar o valor do troco. As entradas de dados devem ser validadas.


import java.util.Scanner;

public class TrocoCliente {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		int atender = 1;
		
		while(atender == 1) {
			
			double valorPagamento = 0;
			double valorCompra = 0;
			double troco = 0;
			
			do {
				System.out.println("Valor de pagamento do cliente e o valor da compra: ");
				valorPagamento = myObj.nextDouble();
				valorCompra = myObj.nextDouble();
				troco = 0;
				
				troco = valorPagamento - valorCompra;
			}while ((valorPagamento < valorCompra) | (valorPagamento == 0));
			
			System.out.println("Valor do troco: " + troco);
			
			System.out.println("Atender proximo cliente: 1 = Sim || 2 = Não");
			atender = myObj.nextInt();
			
		}

	}

}
