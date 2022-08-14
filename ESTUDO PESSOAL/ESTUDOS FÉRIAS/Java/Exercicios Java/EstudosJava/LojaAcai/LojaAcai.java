//Uma loja que vende açaí e tapioca está em promoção. (1) Se a conta do cliente der mais de R$ 100,00 reais e o cliente for pagar no PIX terá um desconto de 15%. Se for pagar por outro meio de pagamento o desconto será de 10%
//Consirede: O açai custa R$ 12,00 e a tapioca custa R$18,00


import java.util.Scanner;

public class LojaAcai {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		double precoAcai = 12.0;
		double precoTapioca = 18.0;
		
		
		while(true) {
			
			
			System.out.println("Atender proximo cliente: 1 = SIM");
			int operacaoCliente = myObj.nextInt();

			if(operacaoCliente == 1) {
				
				System.out.println("Quantidade de açai: ");
				int qtdAcai = myObj.nextInt();
				
				System.out.println("Quantidade de tapioca: ");
				int qtdTapioca = myObj.nextInt();
				
				double valorConta = (qtdAcai * precoAcai) + (qtdTapioca * precoTapioca);
				System.out.println("A conta ficou: R$" + valorConta);
				
				System.out.println("Digite a número da forma de pagamento: 1 = PIX / 2 = Cartão / 3 = Dinheiro ");
				int opcaoPagamento = myObj.nextInt();
				
				if((valorConta > 100) & (opcaoPagamento == 1)) {
					System.out.println("15% desconto - O valor da sua conta com desconto é: R$" + (valorConta * 0.85));
				}else if(valorConta > 100) {
					System.out.println("10% desconto - O valor da sua conta com desconto é: R$" + (valorConta * 0.90));
				}else {
					System.out.println("Sem desconto.");
				}
				
			}else {
				System.out.println("Ok, estou a disposição se precisar. :D");
			}
			
			

			
		}
		
	}

}
