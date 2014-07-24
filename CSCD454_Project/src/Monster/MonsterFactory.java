package Monster;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class MonsterFactory {
	
	//Once you add a monster, update the bumber of monsters total
	private static int numberOfMonsters = 6;
	
	/*
	 * @param int Is the randomly generated number that is passed in to pick a monster to create.
	 * @return Monster based on input type.
	 */
	public static Monster getMonster(int type) {
		
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
