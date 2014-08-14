/**
 * 
 */
package Monster.GopinichSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class MeteorStorm implements GopinichSkills{

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I just cast a storm of meteorites!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "MeteorStorm";
	}
}