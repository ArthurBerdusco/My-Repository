/**
 * 
 */

/**
 * @author arthur.sbsouza
 *
 */
import java.util.Scanner;
import java.text.DecimalFormat;


public class OperacoesConta extends Conta{

	private double checarSaldo = 0;
	private double salvarSaldo = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat formatoDinheiro = new DecimalFormat("'$'###,##0.00");
	
	
	public double getChecarSaldo() {
		return checarSaldo;
	}
	
	public double calcChecarSaque(double amount) {
		checarSaldo = (checarSaldo - amount);
		return checarSaldo;
	}
	
	public double calcChecarDeposito(double amount) {
		checarSaldo = (checarSaldo + amount);
		return checarSaldo;
	}
	
	public void getChecarSaqueInput() {
		System.out.println("Checando o saldo da conta: " + formatoDinheiro.format(checarSaldo));
		System.out.println("Quanto você quer sacar da sua conta: ");
		double amount = input.nextDouble();
		
		if((checarSaldo - amount) > 0) {
			calcChecarSaque(amount);
			System.out.println("Novo saldo: " + formatoDinheiro.format(checarSaldo));
		}else {
			System.out.println("Seu saldo está negativo" + "\n");
		}
	}
	
	public void getChecarDepositoInput() {
		System.out.println("Checando o saldo da conta: " + formatoDinheiro.format(checarSaldo));
		System.out.println("Quanto você quer depositar da sua conta: ");
		double amount = input.nextDouble();
		
		if((checarSaldo + amount) > 0) {
			calcChecarDeposito(amount);
			System.out.println("Novo saldo: " + formatoDinheiro.format(checarSaldo));
		}else {
			System.out.println("Seu saldo está negativo" + "\n");
		}
	}
}