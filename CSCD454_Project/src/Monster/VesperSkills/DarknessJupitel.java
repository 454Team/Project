package Monster.VesperSkills;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class DarknessJupitel implements VesperSkills {

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I just created a darkness jupitel!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "DarknessJupitel";
	}
}
