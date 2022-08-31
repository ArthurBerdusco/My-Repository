
public class GetterSetter {
	
	String nome;
	int idade;
	String genero;
	
	public GetterSetter(String nome, int idade, String genero) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public static void main(String[] args) {
		
		GetterSetter aluno1 = new GetterSetter("Arthur", 22, "Masculino");
		
		aluno1.setNome("Carlos");
		System.out.println(aluno1.getIdade());
		System.out.println(aluno1.nome);

	}

}
