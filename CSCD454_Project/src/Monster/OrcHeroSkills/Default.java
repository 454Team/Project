package Monster.OrcHeroSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Default implements OrcHeroSkills {

	@Override
	public void attack() {
		System.out.println("I tried to do a special attack but I haven't set it so I failed at this turn...");
	}

}