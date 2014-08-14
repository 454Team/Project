package character.PriestSkills;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Sanctuary implements priestSkills{

	@Override
	public int attack() {
		System.out.println("I just just created a sanctuary boosting my teammates stats!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "Sanctuary";
	}
}
