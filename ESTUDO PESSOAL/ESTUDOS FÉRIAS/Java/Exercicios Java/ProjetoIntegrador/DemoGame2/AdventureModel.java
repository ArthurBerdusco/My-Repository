import java.util.HashMap;
import java.util.Scanner;

public class AdventureModel {
 private Room rooms[];
 private Thing things[];
 private Adventurer adventurer;

 public AdventureModel() {
 }
 
 public void initGame(){
 things = new Thing[8];
 rooms = new Room[16];
 
 things[0] = new Thing("Gold", "A gold is hidden in this room");
 things[1] = new Thing("Dragon", "A dragon is taking care of room");
 things[2] = new Thing("Banner", "Banner is pasted outside the wall");
 things[3] = new Thing("Food",   "Food for whole people in the room");
 things[4] = new Thing("Army", "An army to protect room");
 things[5] = new Thing("Boat", "A boat to sail over water");
 things[6] = new Thing("Dragon Glass", "An Sword to shoot Enemy");
 
 
	rooms[0] = new Room("Hall Principal", "Para onde você quer ir: ");
	
	rooms[1] = new Room("2º Andar", " O zelador está em frente uma porta.");
	//rooms[1].addObject(personagem[0]);
	
	rooms[2] = new Room("2º Andar - Sala 301", "Trancada necessita da chave enferrujada.");
	
	rooms[3] = new Room("Biblioteca",", livros empoeirados, parecem ser antigos... Deve ter algum livro interessante.");
	rooms[3].addObject(things[0]);
	rooms[3].addObject(things[1]);
	rooms[3].addObject(things[2]);
	
	rooms[4] = new Room("Porão da biblioteca","Á uma fechadura com um enigma... Como será que abre isso? ");
	rooms[4].addObject(things[3]);
	
	 
	rooms[5] = new Room("Sala de aula.","Está semana tenho 3 aulas.");
	//rooms[5].addObject(aula[0]);
	//rooms[5].addObject(thing[4]);
//	rooms[5].addObject(aula[1]);
//	rooms[5].addObject(thing[5]);
//	rooms[5].addObject(aula[2]); // ira contar historia do vião
	 
	rooms[6] = new Room("Campus da escola"," Ganha vida.");
	
	rooms[7] = new Room("Vale da floresta Sombria",", Um globin escondido protege a floresta.");
//	rooms[7].addObject(personagem[1]);
//	rooms[7].addObject(things[2]);
	 
	rooms[8] = new Room("Caverna sombria","Sinto o cheiro do perigo... Algo no fundo da caverna está brilhando");
//	rooms[8].addObject(personagem[3]);
	rooms[8].addObject(things[5]);
	rooms[8].addObject(things[2]);
	
	rooms[9] = new Room("Lago perdido","Um minotauro está furioso ao saber da sua intrusão.");
//	rooms[9].addObject(personagem[2]);
	rooms[9].addObject(things[4]);
	
	rooms[10] = new Room("Pantano","você encontrou uma porta trancada. Use a chave do dragão para abrir.");
	rooms[10].addObject(things[6]);
	
	rooms[11] = new Room("Portal","Para acessar o portal, resolva o enigma.");
//	rooms[11].addObject(personagem[4]);
	
	

	rooms[0].addDirection("norte", rooms[1]);
	rooms[0].addDirection("leste",rooms[5]);
	rooms[0].addDirection("oeste",rooms[3]);
	 	 
	rooms[1].addDirection("norte",rooms[2]);
	rooms[1].addDirection("sul",rooms[0]);
	 
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

	rooms[10].addDirection("oeste",rooms[9]);
	 
	rooms[11].addDirection("sul",rooms[2]);
 
 adventurer = new Adventurer(rooms[0],null,0);
 }
 
 public void startGame(){
 initGame();
 Scanner input = new Scanner(System.in);
 String cmd;
 Location currentLoc ,newLoc= null;
 int takeThing;
 
 boolean b = false;
 do{
 currentLoc = adventurer.getLocation();
 showHelpMenu();
 cmd = input.next();
 if(cmd.equalsIgnoreCase("Go")){
 do {
 System.out.println("Current Location : "+ currentLoc);
 System.out.println("Escolha uma direção:");
 System.out.println("norte, sul, leste, oeste");
 String direc = input.next();
 
 b = checkPathExist(direc,currentLoc);
 if(b) {
 newLoc = adventurerNextLocation(direc,currentLoc);
 adventurer.setLocation((Room) newLoc);
                }
 
 else {
 System.out.println("Here is Water or Wall");
 System.out.println("You can't Move to this direction");
                     }
                }while(b==false);       
            }
 else if(cmd.equalsIgnoreCase("Look")){
 if(currentLoc instanceof Room)
                    ((Room) currentLoc).viewRoomContent();
 adventurer.viewAdventurerInventory();
            }
 else if(cmd.equalsIgnoreCase("Take")){
 if(currentLoc instanceof Room) {
                ((Room) currentLoc).viewRoomContent();
 System.out.println("Take the thing 0/1/2/3 .. from the room : ");
 takeThing = Integer.parseInt(input.next());
 Thing t = ((Room) currentLoc).getRoomItem(takeThing);
 adventurer.take(t);
 adventurer.viewAdventurerInventory();
                }
 
            }
 else if(cmd.equalsIgnoreCase("Drop")){
 adventurer.viewAdventurerInventory();
 System.out.println("Drop the thing 0/1/2/3 .. from the Inventory to room : ");
 takeThing = Integer.parseInt(input.next());
 if(currentLoc instanceof Room) {
 Thing t =adventurer.getInventoryItem(takeThing);
                    ((Room) currentLoc).addObject(t);
                    ((Room) currentLoc).viewRoomContent();
                }
 
            }
 else if(cmd.equalsIgnoreCase("Use")){
 adventurer.viewAdventurerInventory();
 System.out.println("Use the thing 0/1/2/3 .. from the Inventory : ");
 takeThing = Integer.parseInt(input.next());
 Thing t =adventurer.getInventoryItem(takeThing);
 adventurer.drop(t);
            }
 else if(cmd.equalsIgnoreCase("Exit")){
 System.exit(0);
            }
 else{
 System.out.println("Invalid command");
            }
 
        }while(true);
 
    }
 public void showHelpMenu() {
 System.out.println("Choose command: ");
 System.out.println("Go");
 System.out.println("Look");
 System.out.println("Take");
 System.out.println("Drop");
 System.out.println("Use");
 System.out.println("Exit ");
 System.out.println();
    }
 
 public boolean checkPathExist(String path , Location loc) {
 
 HashMap<String ,Location> hm = loc.getRoomDir();
 if(hm.containsKey(path)) {
 if(hm.get(path) instanceof Room)
 return true;
        }   
 return false;
        }
 
 public Location adventurerNextLocation(String path , Location loc) {
 
 HashMap<String ,Location> hm = loc.getRoomDir();
 if(hm.containsKey(path)) {
 if(hm.get(path) instanceof Room)
 return hm.get(path);
        }
 return loc;
 
    }
}