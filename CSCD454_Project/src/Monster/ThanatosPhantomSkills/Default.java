package Monster.ThanatosPhantomSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Default implements ThanatosPhantomSkills {

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I tried to do a special attack but I haven't set it so I failed at this turn...");
		return 0;
	}

	@Override
	public String getDesc() {
		return "Default";
	}
}