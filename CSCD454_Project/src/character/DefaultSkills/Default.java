/**
 * 
 */
package character.DefaultSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Default implements defaultSkills {

	@Override
	public int attack(double agility, double luck) {
		System.out.println("I did a default skill attack");
		return (int) agility;
	}

	@Override
	public String getDesc() {
		return "Default";
	}

}