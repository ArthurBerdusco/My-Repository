import java.util.Scanner;

public class Player {
	
	Scanner myScanner = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in); 
	
	int vidaJogador;
	String nomeJogador;
	String armaJogador;
	int capaInvisibilidade;
	int aula;
	int chaveEnferrujada = 0;
	int talismaSalvacao = 0;
	
	public Player(int vida, String arma, int capa, int aulas, int chave, int talisma){
		vidaJogador = vida;
		armaJogador = arma;
		capaInvisibilidade = capa;
		aula = aulas;
		chaveEnferrujada = chave;
		talismaSalvacao = talisma;
	}
	
	public void setNomeJogador(String nome) {
		nomeJogador = nome;
	}
	
	public String getNomeJogador() {
		return this.nomeJogador;
	}

}
