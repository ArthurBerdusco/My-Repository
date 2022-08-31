import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OpcoesMenu extends Conta{
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat formatoDinheiro = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(952341, 812737);
				data.put(817235, 539263);
				System.out.println("Bem vindo ao meu projeto ATM");
				System.out.println("Entre com seu numero de conta");
				setNumeroCliente(menuInput.nextInt());
				
				System.out.println("Coloque o numero do seu PIN: ");
				setNumeroPin(menuInput.nextInt());
				
			}catch(Exception e) {
				System.out.println("\n" + "Caracter inválido(s). Coloque apenas números." + "\n");
				x = 2;
				
			}
			int nc = getNumeroCliente();
			int np = getNumeroPin();
			
			if(data.containsKey(nc) && data.get(nc) == np) {
				getTipoConta();
			}else {
				System.out.println("\n" + "Número da Conta ou Pin errado." + "\n");
			}
		}while(x == 1);
	}

	public void getTipoConta() {
		System.out.println("Selecione a opção da conta que você quer acessa: ");
		System.out.println("Tipo 1 - Checar conta");
		System.out.println("Tipo 2 - Salvar conta");
		System.out.println("Tipo 3 - Sair");
		
		int selecao = menuInput.nextInt();
		
		switch (selecao) {
		case 1:
			getChecar();
			break;
		
		case 2:
			getSalvar();
			break;
			
		case 3:
			break;
		
		
		default:
			System.out.println("Opção invalida." + "\n");
			getTipoConta();
		}
	}

	public void getChecar() {
		System.out.println("Chegar conta: ");
		System.out.println("Tipo 1 - Ver saldo");
		System.out.println("Tipo 2 - Sacar");
		System.out.println("Tipo 3 - Depositar");
		System.out.println("Tipo 4 - Sair");
		System.out.println("Escolha: ");
		
		int selecao = menuInput.nextInt();
		
		switch(selecao) {
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
		case 4:
			System.out.println("Obrigado por usar meu ATM, tchau.");
			break;
		
		default:
			System.out.println("\n" + "Opção invalida" + "\n");
			getChecar();
			
		}
	}

	public void getSalvar() {
		System.out.println("Salvar conta: ");
		System.out.println("Tipo 1 - Ver saldo");
		System.out.println("Tipo 2 - Sacar");
		System.out.println("Tipo 3 - Depositar");
		System.out.println("Tipo 4 - Sair");
		System.out.println("Escolha: ");
		
		int selecao = menuInput.nextInt();
		
		switch(selecao) {
		case 1:
			System.out.println("Saldo da sua conta: " + formatoDinheiro.format(getChecarSaldo()));
			getTipoConta();
			break;
			
		case 2:
			getSalvarSaqueInput();
			getTipoConta();
			break;
			
		case 3:
			getSalvarDepositoInput();
			getTipoConta();
			break;
		case 4:
			System.out.println("Obrigado por usar meu ATM, tchau.");
			break;
		
		default:
			System.out.println("\n" + "Opção invalida" + "\n");
			getChecar();
			
		}
	}
}



