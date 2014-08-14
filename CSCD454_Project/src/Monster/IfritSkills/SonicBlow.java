package Monster.IfritSkills;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class SonicBlow implements IfritSkills {

	@Override
	public int attack() {
		System.out.println("I just did a sonic blow!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "SonicBlow";
	}
}
