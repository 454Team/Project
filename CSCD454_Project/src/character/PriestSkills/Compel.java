/**
 * 
 */
package character.PriestSkills;

import java.util.Random;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Compel implements priestSkills{

	private final Random random = new Random();
	
	@Override
	public int attack(double agility, double luck) {
		if(random.nextInt(100) < luck)
		{
			System.out.println("The power of Priest compells you!");
			return random.nextInt((int) agility) * 3;
		}
		return 0;
	}

	@Override
	public String getDesc() {
		return "Resurrection";
	}
}