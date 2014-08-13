package character.AssassinSkills;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class DoubleAttack implements assassinSkills{

	@Override
	public int attack() {
		System.out.println("I just did the attack twice!");
		return 0;
	}

}
