package Monster;

import java.util.Random;

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
	public static Monster getMonster(int room) {
		//Generates a random monster
		int type = 999;
		Random randomGenerator = new Random();
	    randomGenerator.nextInt(100);
		type = randomGenerator.nextInt(MonsterFactory.getNumberOfMonsters());
		
		if(type == 0)
			return new ThanatosPhantom(room);
		else if(type == 1)
			return new OrcHero(room);
		else if(type == 2)
			return new Ifrit(room);
		else if(type == 3)
			return new Gopinich(room);
		else if(type == 4)
			return new DarkSnakeLord(room);
		else // In worst case scenario return a default monster
			return new Vesper(room);
	} // End getMonster
	
	public static int getNumberOfMonsters(){
		return numberOfMonsters;
	}
	
} // End MonsterFactory
