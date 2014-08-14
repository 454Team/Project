package Monster.ThanatosPhantomSkills;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class SoulStrike implements ThanatosPhantomSkills {

	@Override
	public int attack() {
		System.out.println("I just did a soul strike!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "SoulStrike";
	}
}
