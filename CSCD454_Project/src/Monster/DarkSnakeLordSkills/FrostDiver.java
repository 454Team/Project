/**
 * 
 */
package Monster.DarkSnakeLordSkills;

/**
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class FrostDiver implements DarkSnakeLordSkills{

	@Override
	public int attack() {
		System.out.println("I just did a frost dive!");
		return 0;
	}

	@Override
	public String getDesc() {
		return "FrostDiver";
	}
}