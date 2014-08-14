package character.SorcererSkills;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class MagicCrasher implements SorcererSkills{

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I just crashed a bunch of magic at the enemy, Yo!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "MagicCrasher";
	}
}
