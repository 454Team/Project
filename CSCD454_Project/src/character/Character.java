package character;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public interface Character {
	
	public void fight();
	public void specialAttack();
	public void heal();
	public void defend();
	public void retreat();
	public void equip();
	public void useItem();
	public boolean isAlive();
	
} // End Character
