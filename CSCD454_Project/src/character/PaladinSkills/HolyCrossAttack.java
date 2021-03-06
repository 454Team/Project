package character.PaladinSkills;

import java.util.Random;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class HolyCrossAttack implements paladinSkills{

	private final Random random = new Random();
	
	@Override
	public int attack(double agility, double luck) {
		if(random.nextInt(100) < luck)
		{
			System.out.println("I just did the holy cross attack!");
			return random.nextInt((int) agility) * 3;
		}
		return 0;
	}

	@Override
	public String getDesc() {
		return "HolyCrossAttack";
	}

}
