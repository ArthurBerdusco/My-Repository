import java.util.Scanner;

public class Personagem extends Bussola{
	
	Scanner scan = new Scanner(System.in);
	public String nome;
	int vida;
	
	class Player extends Personagem{
		int vida = 10;
		String playerWeapon;
	}
	
	class Globin extends Personagem{
		int vida = 15;
	}
	
	class  Minotauro extends Personagem{
		int vida = 20;
	}
	
	class FireDragon extends Personagem{
		int vida = 300;
	}
	
	class Phaeron extends Personagem{
		int vida = 8000;
	}
	
	
	public void zelador() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Você se depara com o zelador da escola e ele está bloqueando uma porta.");
		System.out.println("");
		System.out.println("Oque você quer fazer?");
		System.out.println("");
		System.out.println("1. Conversar com o zelador.");
		System.out.println("2. Passar pelo o zelador.");
		System.out.println("3. Voltar");
		System.out.println("\n------------------------------------------------------------------\n");
		
		int escolha = myScanner.nextInt();

		if (escolha == 1) { 
			if (capaInvisibilidade == 1) {
				System.out.println("FAZER");
			} else {
				System.out.println("Zelador: Olá " + getNomeJogador()
						+ "? \nSinto muito mas você não pode passar por essa porta. Você deve voltar agora.");
				enterScanner.nextLine();
				zelador();
			}

		} else if (escolha == 2) {
			vidaJogador = vidaJogador - 1;
			System.out.println(
					"Zelador: Hey não seja estupido, você não ira passar por esta porta.\n\nO zelador conteve você a força.\n(Você recebeu 1 de dano.)\n");
			System.out.println("Your HP: " + vidaJogador);
			enterScanner.nextLine();
			zelador();
		} else if (escolha == 3) {
			crossRoad();
		} else {
			hallPrincipal();
		}
	}
	public void globin() {
		System.out.println("Você se depara com um Globin, um monstro que defende a floresta. Ele parece ser uma criatura aterrorizante.");
		System.out.println("Aparentemente ele não está para conversas... E não deixará você ir adiante");
		System.out.println("O que você quer fazer: ");
		System.out.println("1. Correr");
		System.out.println("2. Atacar");
		
		int escolha = scan.nextInt();
		if(escolha == 1) {
			attack();
		}else if(escolha ==2 ) {
			hallPrincipal();
		}else {
			System.out.println("Escolha inválida.");
			globin();
		}
	}

	public void fight() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Sua vida: " + vidaJogador);
		System.out.println("Vida do Monstro: " + vidaJogador);
		System.out.println("\n1: Atacar");
		System.out.println("2: Correr");
		System.out.println("\n------------------------------------------------------------------\n");

		int escolha = myScanner.nextInt();

		if (escolha == 1) {
			attack();
		} else if (escolha == 2) {
			crossRoad();
		} else {
			fight();
		}
	}
	
	public void attack() {
		int playerDamage = 0;
	
		if (armaJogador.equals("Knife")) {
			playerDamage = new java.util.Random().nextInt(1);
		} else if (armaJogador.equals("Long Sword")) {
			playerDamage = new java.util.Random().nextInt(8);
		}
	
		System.out.println("You attacked the monster and gave " + playerDamage + " damage!");
	
		monsterHP = monsterHP - playerDamage;
	
		System.out.println("Monster HP: " + monsterHP);
	
		if (monsterHP < 1) {
			win();
		} else if (monsterHP > 0) {
			int monsterDamage = 0;
	
			monsterDamage = new java.util.Random().nextInt(4);
	
			System.out.println("The monster attacked you and gave " + monsterDamage + " damage!");
	
			playerHP = playerHP - monsterDamage;
	
			System.out.println("Player HP: " + playerHP);
	
			if (playerHP < 1) {
				dead();
			} else if (playerHP > 0) {
				fight();
			}
		}
	
	}

}

