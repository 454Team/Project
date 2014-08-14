package Monster.GopinichSkills;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class SilenceAttack implements GopinichSkills{

	@Override
	public int attack() {
		System.out.println("I just did a silenced attack!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "SilenceAttack";
	}
}
