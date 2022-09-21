/**
 * 
 */

/**
 * @author arthur.sbsouza
 *
 */
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MenuOpcoes extends OperacoesConta{
	
	OperacoesConta usuario1 = new OperacoesConta();
	OperacoesConta usuario2 = new OperacoesConta();
	
	
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat formatoDinheiro = new DecimalFormat("'$'###,##0.00");

	
	public void getLogin() throws IOException{
		int x=1;
		do {
			
			try {
				
				usuario1.conta = 30530;
				usuario1.agencia = 1501;
				usuario1.senha = 777123;
				
				usuario2.conta = 1234;
				usuario2.agencia = 8586;
				usuario2.senha = 3334;
				
				
				System.out.println("Bem vindo ao meu projeto ATM");
				System.out.println("Entre com seu numero de conta");
				setNumeroCliente(menuInput.nextInt());
				System.out.println("Coloque o numero do seu PIN: ");
				setNumeroSenha(menuInput.nextInt());
				
			}catch(Exception e) {
				System.out.println("\n" + "Caracter inválido(s). Coloque apenas números." + "\n");
				x = 2;
			}
			
			int nc = getNumeroCliente();
			int np = getNumeroSenha();
			
			if(usuario1.conta == nc && usuario1.senha == np) {
				getTipoConta();
			}else {
				System.out.println("\n" + "Número da Conta ou Pin errado." + "\n");
			}
		}while(x == 1);
	}
	
	public double transferirDinheiro() {
		
		if(getChecarSaldo() > 0) {
			System.out.println("Digite o numero da conta: ");
			int nc = input.nextInt();
			System.out.println("Digite o numero da agencia: ");
			int na = input.nextInt();
			if((nc == usuario2.conta) && (na == usuario2.agencia)) {
				System.out.println("Valor: ");
				double valorTransferencia = input.nextDouble();
				return valorTransferencia;
			}else {
				System.out.println("Número da conta ou agencia inválido.");
			}return 0;
		}else {
			System.out.println("Voce nao tem saldo suficiente para efetuar transferencia");
		}
		return 0;
	}

	public void getTipoConta() {
		System.out.println("Selecione a opção da conta que você quer acessa: ");
		System.out.println("[ 1 ] - Ver saldo");
		System.out.println("[ 2 ] - Sacar");
		System.out.println("[ 3 ] - Depositar");
		System.out.println("[ 4 ] - Transferir");
		System.out.println("[ 5 ] - Extrato");
		System.out.println("[ 6 ] - Investimentos");
		
		int selecao = menuInput.nextInt();
		
		switch (selecao) {
		case 1:
			System.out.println("Saldo da sua conta: " + formatoDinheiro.format(getChecarSaldo()));
			getTipoConta();
			break;
		case 2:
			sacarDinheiro();
			getTipoConta();
			break;
		case 3:
			depositarDinheiro();
			getTipoConta();
			break;
			
		case 4:
			double valorTransferencia = transferirDinheiro();
			
			
			System.out.println(usuario2.atualizarSaldoSaque(valorTransferencia));
			System.out.println(usuario2.getChecarSaldo());
			getTipoConta();
			break;
			
			
		default:
			System.out.println("Opção invalida." + "\n");
			getTipoConta();
		}
	}
}