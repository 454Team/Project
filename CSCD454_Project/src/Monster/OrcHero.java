package Monster;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class OrcHero implements Monster {

	public double strength = 1.00;
	public double agility = 91.00;
	public double vitality = 30.00;
	public double intelligence = 70.00;
	public double dexterity = 105.00;
	public double luck = 90.00;
	
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defend() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void test() {
		System.out.println("I am a Orc Hero!");
	}

	@Override
	public void specialAttack2() {
		// TODO Auto-generated method stub
		
	}
	
	public double getStrength() {
		return strength;
	}
	
	public double getAgility() {
		return agility;
	}

	public double getVitality() {
		return vitality;
	}

	public double getIntelligence() {
		return intelligence;
	}

	public double getDexterity() {
		return dexterity;
	}

	public double getLuck() {
		return luck;
	}


} // End OrcHero
