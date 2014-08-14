package character;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class DefaultCharacter extends Character {

	public DefaultCharacter() {
		super();
	} // End DVC
	
	@Override
	public int fight() {
		return super.fight();
	}
/*
	@Override
	public boolean isAlive() {
		return super.getVitality() > 0;
	}*/

	@Override
	public SkillsMain[] getSkillNames() {
		return new SkillsMain [0];
	}

} // End Default Character
