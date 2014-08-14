/**
 * 
 */
package Monster.DarkSnakeLordSkills;

import java.util.Random;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Hellfire implements DarkSnakeLordSkills{
	
	private final Random random = new Random();
	
	@Override
	public int attack(double agility, double luck) {
		if(random.nextInt(100) < luck)
		{
			System.out.println("I just rained hell fire!");
			return random.nextInt((int) agility) * 2;
		}
		return 0;
	}

	@Override
	public String getDesc() {
		return "HellFire";
	}
}