package Monster.VesperSkills;

import java.util.Random;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class DarknessJupitel implements VesperSkills {
	
	private final Random random = new Random();
	
	@Override
	public int attack(double agility, double luck) {
		if(random.nextInt(100) < luck)
		{
			System.out.println("I just created a darkness jupitel!");
			return random.nextInt((int) agility) * 2;
		}
		return 0;
	}

	@Override
	public String getDesc() {
		return "DarknessJupitel";
	}
}
