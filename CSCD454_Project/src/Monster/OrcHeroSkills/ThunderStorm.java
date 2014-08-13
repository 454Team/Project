package Monster.OrcHeroSkills;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class ThunderStorm implements OrcHeroSkills {

	@Override
	public int attack() {
		System.out.println("I just did a sonic blow!");
		return 0;
	}

}
