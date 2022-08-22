
public class Objeto {
	static void myStaticMethod() {
		System.out.println("Metodos estaticos podem ser acessados sem criar um objeto");
	}
	
	public void myPublicMethod() {
		System.out.println("Para acessar metodos publicos é necessario criar um objeto");
	}

	public static void main(String[] args) {
		myStaticMethod();
		
		Objeto myObj = new Objeto();
		myObj.myPublicMethod();

	}

}
