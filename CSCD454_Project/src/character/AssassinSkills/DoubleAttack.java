package character.AssassinSkills;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class DoubleAttack implements assassinSkills{

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I just did the attack twice!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "DoubleAttack";
	}

}
