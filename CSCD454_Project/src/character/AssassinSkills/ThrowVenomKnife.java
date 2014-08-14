/**
 * 
 */
package character.AssassinSkills;

import java.util.Random;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class ThrowVenomKnife implements assassinSkills{

	private final Random random = new Random();
	
	@Override
	public int attack(double agility, double luck) {
		if(random.nextInt(100) < luck)
		{
		System.out.println("I just threw a venemous knife!");
		return random.nextInt((int) agility) * 4;
		}
		return 0;
	}

	@Override
	public String getDesc() {
		return "ThrowVenomKnife";
	}

}