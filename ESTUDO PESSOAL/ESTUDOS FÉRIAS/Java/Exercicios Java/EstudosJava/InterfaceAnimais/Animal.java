
public abstract class Animal {
	String nome;

	public String getName() {
		return this.nome;
	}

	public void setName(String newName) {
		nome = newName;
	}

	abstract void emitirSom();
}
