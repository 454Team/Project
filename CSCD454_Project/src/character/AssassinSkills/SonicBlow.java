/**
 * 
 */
package character.AssassinSkills;

import java.util.Random;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class SonicBlow implements assassinSkills{

	private final Random random = new Random();
	
	@Override
	public int attack(double agility, double luck) {
		if(random.nextInt(100) < luck)
		{
		System.out.println("I just did a sonic blow!");
		return random.nextInt((int) agility) * 3;
		}
		return 0;
	}

	@Override
	public String getDesc() {
		return "SonicBlow";
	}

}