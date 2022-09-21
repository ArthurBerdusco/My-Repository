public class Conta{
	int conta;
	int agencia;
	int senha;
	int saldo;
	String nome;
	String sobrenome;
	
	public int setNumeroCliente(int conta) {
		this.conta = conta;
		return conta;
	}
	
	public int getNumeroCliente() {
		return conta;
	}
	
	public int setNumeroAgencia(int agencia) {
		this.agencia = agencia;
		return agencia;
	}
	
	public int getNumeroAgencia() {
		return agencia;
	}
	
	public int setNumeroSenha(int senha) {
		this.senha = senha;
		return senha;
	}
	
	public int getNumeroSenha() {
		return senha;
	}
	
}