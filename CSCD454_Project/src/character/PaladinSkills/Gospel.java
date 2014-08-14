/**
 * 
 */
package character.PaladinSkills;

import java.util.Random;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Gospel implements paladinSkills{

	private final Random random = new Random();
	
	@Override
	public int attack(double agility, double luck) {
		if(random.nextInt(100) < luck)
		{
		System.out.println("I just sang the Gospel and increased my team members stats!");
		return random.nextInt((int) agility) * 2;
		}
		return 0;
	}

	@Override
	public String getDesc() {
		return "Gospel";
	}

}