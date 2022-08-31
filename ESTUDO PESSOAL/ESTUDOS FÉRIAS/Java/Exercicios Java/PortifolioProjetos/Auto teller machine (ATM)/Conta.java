import java.util.Scanner;
import java.text.DecimalFormat;


public class Conta {
	private int numeroCliente;
	private int numeroPin;
	private double checarSaldo = 40000;
	private double salvarSaldo = 40000;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat formatoDinheiro = new DecimalFormat("'$'###,##0.00");
	
	public int setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
		return numeroCliente;
	}
	
	public int getNumeroCliente() {
		return numeroCliente;
	}
	
	public int setNumeroPin(int numeroPin) {
		this.numeroPin = numeroPin;
		return numeroPin;
	}
	
	public int getNumeroPin() {
		return numeroPin;
	}
	
	public double getChecarSaldo() {
		return checarSaldo;
	}
	
	public double calcChecarSaque(double amount) {
		checarSaldo = (checarSaldo - amount);
		return checarSaldo;
	}
	
	public double calcSalvarSaque(double amount) {
		salvarSaldo = (salvarSaldo - amount);
		return salvarSaldo;
	}
	
	public double calcChecarDeposito(double amount) {
		checarSaldo = (checarSaldo + amount);
		return checarSaldo;
	}
	
	public double calcSalvarDeposito(double amount) {
		salvarSaldo = (salvarSaldo + amount);
		return salvarSaldo;
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
	
	public void getSalvarSaqueInput() {
		System.out.println("Salvando o saldo da conta: " + formatoDinheiro.format(salvarSaldo));
		System.out.println("Quanto você quer sacar da sua conta: ");
		double amount = input.nextDouble();
		
		if((salvarSaldo - amount) > 0) {
			calcChecarSaque(amount);
			System.out.println("Novo saldo: " + formatoDinheiro.format(salvarSaldo));
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
	
	public void getSalvarDepositoInput() {
		System.out.println("Salvando o saldo da conta: " + formatoDinheiro.format(salvarSaldo));
		System.out.println("Quanto você quer depositar da sua conta: ");
		double amount = input.nextDouble();
		
		if((salvarSaldo + amount) > 0) {
			calcChecarDeposito(amount);
			System.out.println("Novo saldo: " + formatoDinheiro.format(salvarSaldo));
		}else {
			System.out.println("Seu saldo está negativo" + "\n");
		}
	}
	
}
