package Monster;

import java.util.ArrayList;
import java.util.Random;

import Items.characterSlots.HeroSlot;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class MonsterFactory {
	
	//Once you add a monster, update the number of monsters total
	private static int numberOfMonsters = 6;
	
	/*
	 * @param int Is the randomly generated number that is passed in to pick a monster to create.
	 * @return Monster based on input type.
	 */
	public static ArrayList<Monster> getMonster(int room, int numMons) {
		//Generates a random monster
		ArrayList<Monster> monsters = new ArrayList<Monster>();
		for(int i = 0; i < numMons; i ++){
			int type = 999;
			Random randomGenerator = new Random();
		    randomGenerator.nextInt(100);
			type = randomGenerator.nextInt(MonsterFactory.getNumberOfMonsters());
			switch(type){			
				case 0:
					monsters.add(new ThanatosPhantom(room));
					break;
				case 1:
					monsters.add(new OrcHero(room));
					break;
				case 2:
					monsters.add(new Ifrit(room));
					break;
				case 3:
					monsters.add(new Gopinich(room));
				case 4:
					monsters.add(new DarkSnakeLord(room));
				default:// In worst case scenario return a default monster
					monsters.add(new Vesper(room));
			}
		}
		return monsters;
	} // End getMonster
	
	public static int getNumberOfMonsters(){
		return numberOfMonsters;
	}
	
} // End MonsterFactory
