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
	
	Conta usuario1 = new Conta();
	Conta usuario2 = new Conta();
	
	
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat formatoDinheiro = new DecimalFormat("'$'###,##0.00");

	
	public void getLogin() throws IOException{
		int x=1;
		do {
			getTipoConta();
			try {
				
				usuario1.conta = 30530;
				usuario1.agencia = 1501;
				usuario1.senha = 777123;
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
			getChecarSaqueInput();
			getTipoConta();
			break;
		case 3:
			getChecarDepositoInput();
			getTipoConta();
			break;
		default:
			System.out.println("Opção invalida." + "\n");
			getTipoConta();
		}
	}
}
