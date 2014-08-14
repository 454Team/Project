package Monster.DarkSnakeLordSkills;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class DarkBreath implements DarkSnakeLordSkills{

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I just breathed darkness!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "DarkBreath";
	}
}
