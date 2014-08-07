package Monster;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public interface Monster {
	
	public void test(); //TESTING
	
	public void fight();
	public void defend();
	public void defend(double damage);
	public void specialAttack();
	public void specialAttack2();
	public boolean isAlive();
	
	public double getStrength();
	public double getAgility();
	public double getVitality();
	public double getIntelligence();
	public double getDexterity();
	public double getLuck();
} // End Character
