package Monster;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Ifrit implements Monster {

	public double strength = 120.00;
	public double agility = 180.00;
	public double vitality = 25.00;
	public double intelligence = 190.00;
	public double dexterity = 199.00;
	public double luck = 50.00;
	
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
		System.out.println("I am a Ifrit!");
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


} // End Priest
