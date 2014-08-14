/**
 * 
 */
package character.RogueSkills;

import java.util.Random;

/**
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class BackStab implements rogueSkills{
	
	private final Random random = new Random();
	
	@Override
	public int attack(double agility, double luck) {
		if(random.nextInt(100) < luck)
		{
			System.out.println("I just stabbed the enemy in the back!");
			return random.nextInt((int) agility) * 4;
		}
		return 0;
	}


	@Override
	public String getDesc() {
		return "BackStab";
	}
}