package Monster.ThanatosPhantomSkills;

import java.util.Random;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class SoulStrike implements ThanatosPhantomSkills {

	private final Random random = new Random();
	
	@Override
	public int attack(double agility, double luck) {
		if(random.nextInt(100) < luck)
		{
			System.out.println("I just did a soul strike!");
			return random.nextInt((int) agility) * 2;
		}
		return 0;
	}
	
	@Override
	public String getDesc() {
		return "SoulStrike";
	}
}
