import java.util.Scanner;

public class Bussola{
	
	Scanner myScanner = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
	
	
	
	public void iniciarJogo() {
		
		vidaJogador = 10;
		armaJogador = "Anel solar";
		capaInvisibilidade = 0;
		chaveEnferrujada = 0;
		talismaSalvacao = 0;
		aula = 0;
		
		Bussola andar = new Bussola();
		String playerWeapon = "Espada";

		System.out.println("Sua vida: " + vidaJogador + "HP");
		System.out.println("Sua arma: " + playerWeapon);
		System.out.println("Digite o nome do seu personagem: ");
		setNomeJogador(myScanner.nextLine());
		
		System.out.println("Sua jorgana continua aqui pequeno mago.");
		
		System.out.println("Os 2 primeiros anos na escola de magia não foram nada faceis...");
		
		System.out.println("Combater todos aqueles monstros nas aulas de defesa contra aberrações foi um grande desafio.");
		
		System.out.println("Porém chegamos até aqui, oque de fato já é uma vitoria.");
		
		System.out.println("Neste ano, algo de sombrio está acontecendo em torno da escola.");
		
		System.out.println("O que poderia ser?");
		
		System.out.println("Bom, é isso que você deverá descobrir..." + "\n");
		System.out.println(getNomeJogador());
		andar.hallPrincipal();
	}
	
	
	
	rooms[0] = new Room("Hall Principal");
	
	rooms[1] = new Room("2º Andar - O zelador está em frente uma porta.");
	rooms[1].addObject(personagem[0]);
	
	rooms[2] = new Room("2º Andar - Sala 301 - Trancada, necessita da chave enferrujada.");
	
	rooms[3] = new Room("Biblioteca",", livros empoeirados, parecem ser antigos... Deve ter algum livro interessante.");
	rooms[3].addObject(things[0]);
	rooms[3].addObject(things[1]);
	rooms[3].addObject(things[2]);
	
	rooms[4] = new Room("Porão da biblioteca","Á uma fechadura com um enigma... Como será que abre isso? ");
	rooms[4].addObject(things[3]);
	
	 
	rooms[5] = new Room("Sala de aula.","Está semana tenho 3 aulas.");
	rooms[5].addObject(aula[0]);
	rooms[5].addObject(thing[4]);
	rooms[5].addObject(aula[1]);
	rooms[5].addObject(thing[5]);
	rooms[5].addObject(aula[2]); // ira contar historia do vião
	 
	rooms[6] = new Room("Campus da escola");
	
	rooms[7] = new Room("Vale da floresta Sombria",", Um globin escondido protege a floresta.");
	rooms[7].addObject(personagem[1]);
	rooms[7].addObject(things[2]);
	 
	rooms[8] = new Room("Caverna sombria","Sinto o cheiro do perigo... Algo no fundo da caverna está brilhando");
	rooms[8].addObject(personagem[3]);
	rooms[8].addObject(things[5]);
	rooms[8].addObject(things[2]);
	
	rooms[9] = new Room("Lago perdido","Um minotauro está furioso ao saber da sua intrusão.");
	rooms[9].addObject(personagem[2]);
	rooms[9].addObject(things[4]);
	
	rooms[10] = new Room("Pantano","você encontrou uma porta trancada. Use a chave do dragão para abrir.");
	rooms[10].addObject(things[6]);
	
	rooms[11] = new Room("Portal","Para acessar o portal, resolva o enigma.");
	rooms[11].addObject(personagem[4]);
	
	

	rooms[0].addDirection("norte", rooms[1]);
	rooms[0].addDirection("sul",walls[6]);
	rooms[0].addDirection("leste",rooms[5]);
	rooms[0].addDirection("oeste",rooms[3]);
	 	 
	rooms[1].addDirection("norte",rooms[2]);
	rooms[1].addDirection("sul",rooms[0]);
	rooms[1].addDirection("leste",walls[1]);
	rooms[1].addDirection("oeste",walls[4]);
	 
	rooms[2].addDirection("norte",rooms[11]);
	rooms[2].addDirection("sul",rooms[1]);

	
	rooms[3].addDirection("leste",rooms[0]);
	rooms[3].addDirection("oeste",rooms[4]);
	 
	rooms[4].addDirection("leste",rooms[3]);

	rooms[5].addDirection("oeste",rooms[5]);
	 
	rooms[6].addDirection("norte",rooms[0]);
	rooms[6].addDirection("sul",rooms[7]);
	 

	rooms[7].addDirection("norte",rooms[6]);
	rooms[7].addDirection("sul",rooms[9]);
	 
	rooms[8].addDirection("leste",rooms[9]);
	 
	rooms[9].addDirection("norte",rooms[6]);
	rooms[9].addDirection("leste",rooms[8]);
	rooms[9].addDirection("oeste",rooms[4]);

	ooms[10].addDirection("oeste",rooms[9]);
	 
	rooms[11].addDirection("sul",rooms[2]);
	
	
	
	
	
	

	public void hallPrincipal() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Você está no hall principal da escola.");
		crossRoad();
	}
	
	public void crossRoad() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("1: Ir para o norte");
		System.out.println("2: Ir para o sul");
		System.out.println("3: Ir para o oeste");
		System.out.println("4: Ir para o leste");
		System.out.println("\n------------------------------------------------------------------\n");

		int escolha = myScanner.nextInt();

		if (escolha == 1) {
			norte();
		} else if (escolha == 2) {
			sul();
		} else if (escolha == 3) {
			oeste();
		} else if (escolha == 4) {
			leste();
		} else {
			hallPrincipal();
		}
	}
	
	//CORDENADA NORTE: 
	public void norte() {
		
		System.out.println(jogador.nomeJogador);
		Viloes zelador = new Viloes();
		zelador.zelador();
	}
	
	//CORDENADA SUL: CAMPUS > GLOBIN > MINOTARURO | <DRAGÃO CHAVE SALA SALVAÇÃO<  || >SALA DA SALVAÇÃO> 
	public void sul() {
		if(aula == 0) {
			System.out.println("Para ter acesso ao campus da escola você precisa assistir a primeira aula.");
			System.out.println("A sala de aulas fica ao leste.");
			hallPrincipal();
		}else {
			System.out.println("");
			
			
			
		}
	}
	
	//CORDENADA LESTE: AULAS, CADA AULA IRÁ DAR INSTRUÇÕES E UM ITEM PARA O PLAYER
	public void leste() {
		System.out.println("\n------------------------------------------------------------------\n");
		if(aula == 0) {
			
			
			System.out.println("\n------------------------------------------------------------------\n");

			System.out.println("Você entrou na sala de aula, para assistir sua 1º aula - Historia da Magia.");
			System.out.println("O que você quer fazer?");
			System.out.println("1. Assistir a aula.");
			System.out.println("2. Voltar ao Hall da escola.");
			
			int escolha = myScanner.nextInt();
			
			if(escolha == 1) {
				System.out.println("Professor Slater: Olá alunos essa é a sua primeira aula sobre a");
				System.out.println("Histório da Magia.");
				System.out.println("");
				
				aula = aula + 1;
			}else {
				hallPrincipal();
			}
			
			
			System.out.println("V.");
			
			System.out.println("\n------------------------------------------------------------------\n");
			
		}else if(aula == 1) {
			aula = aula +1;
			System.out.println("PARABENS AULA " + aula);
		}else if(aula == 2) {
			aula = aula +1;
			System.out.println("PARABENS AULA " + aula);
		System.out.println("\n------------------------------------------------------------------\n");
		}
		
		int escolha = myScanner.nextInt();

		if (escolha == 1) {
			crossRoad();
		} else {
			leste();
		}
	}
	
	//CORDENADA OESTE BIBLIOTECA:
	public void oeste() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Você entrou na biblioteca da escola.");
		System.out.println("O que você quer fazer?");
		System.out.println("");
		System.out.println("1. Ver livros. 'Algum livro deve ser interessante...'");
		System.out.println("2. Ir para o Oeste.");
		System.out.println("3. Voltar");
		System.out.println("\n------------------------------------------------------------------\n");
		
		int escolha = myScanner.nextInt();
		
		if(escolha == 1) {
		
			
			System.out.println("Alguns livros chamaram a sua atenção: ");
			System.out.println("1. Slynther o mago das trevas");
			System.out.println("2. A floresta mistica");
			System.out.println("3. O cajado de Zayn");
			System.out.println("4. Voltar.");
			escolha = myScanner.nextInt();
			
			if(escolha == 1) {
				System.out.println("A historia de Slynter é tenebrosa. Esse mago foi expulso da escola depois de tentar tomar a direção e fazer praticas de magias proibidas.");
				System.out.println("Segundo o livro, este mago já tentou invadir a escola diversas vezes para conquistar o poder. Não se sabe porque ele quer tanto...");
			}else if(escolha == 2) {
				System.out.println("Interessante... Segundo relatos do professor Kyan, a floresta misteriosa guarda alguns segredos que podem ser a chave");
				System.out.println("para a existência e salvação da escola se a mesma estiver correndo perido...");
			}else if(escolha == 3) {
				System.out.println("O cajado de Kayn, conforme o professor Forest relata em seu livro, este objeto é capaz de causar muita discórdia se estiver em mãos más.");
				System.out.println("Se algum mago sórdigo conseguir capturar este cajado que toda a escola de magia estaria correndo um perigo eminente. ");
			}else if(escolha > 3) {
				oeste();
			}
			
		}else if(escolha == 2) {
			
			
		}else if(escolha == 3) {
			
			
		}else {
			oeste();
		}

	}

	public void win() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You killed the monster!");
		System.out.println("The monster dropped a ring!");
		System.out.println("You obtaind a silver ring!\n\n");
		System.out.println("1: Go leste");
		System.out.println("\n------------------------------------------------------------------\n");

		silverRing = 1;

		int escolha = myScanner.nextInt();
		if (escolha == 1) {
			crossRoad();
		} else {
			win();
		}

	}

	public void ending() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Guard: Oh you killed that goblin!?? Great!");
		System.out.println("Guard: It seems you are a trustworthy guy. Welcome to our town!");
		System.out.println("\n\n           THE END                    ");
		System.out.println("\n------------------------------------------------------------------\n");
	}
}
