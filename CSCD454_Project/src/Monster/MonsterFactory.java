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
	public static Monster getMonster() {
		//Generates a random monster
		int type = 999;
		Random randomGenerator = new Random();
	    randomGenerator.nextInt(100);
		type = randomGenerator.nextInt(MonsterFactory.getNumberOfMonsters());
		
		if(type == 0)
			return new ThanatosPhantom();
		else if(type == 1)
			return new OrcHero();
		else if(type == 2)
			return new Ifrit();
		else if(type == 3)
			return new Gopinich();
		else if(type == 4)
			return new DarkSnakeLord();
		else // In worst case scenario return a default monster
			return new Vesper();
	} // End getMonster
	
	public static int getNumberOfMonsters(){
		return numberOfMonsters;
	}
	
} // End MonsterFactory
