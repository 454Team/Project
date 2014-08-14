package character.PaladinSkills;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class HolyCrossAttack implements paladinSkills{

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I just did the holy cross attack!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "HolyCrossAttack";
	}

}
