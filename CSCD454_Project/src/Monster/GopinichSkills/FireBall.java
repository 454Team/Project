/**
 * 
 */
package Monster.GopinichSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class FireBall implements GopinichSkills{

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I just threw a fire ball!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "FireBall";
	}
}