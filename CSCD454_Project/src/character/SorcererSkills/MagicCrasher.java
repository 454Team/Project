package character.SorcererSkills;

import java.util.Random;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class MagicCrasher implements SorcererSkills{
	
	private final Random random = new Random();
	
	@Override
	public int attack(double agility, double luck) {
		if(random.nextInt(100) < luck)
		{
			System.out.println("I just crashed a bunch of magic at the enemy, Yo!");
			return random.nextInt((int) agility) * 3;
		}
		return 0;
	}

	@Override
	public String getDesc() {
		return "MagicCrasher";
	}
}
