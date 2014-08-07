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

	@Override
	public void defend() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retreat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void equip() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void useItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAlive() {
		return super.getVitality() > 0;
	}

} // End Default Character
