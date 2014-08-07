package Monster;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class DarkSnakeLord extends MonsterAttributes implements Monster {

	public double strength = 70.00;
	public double agility = 83.00;
	public double vitality = 62.00;
	public double intelligence = 80.00;
	public double dexterity = 164.00;
	public double luck = 88.00;
	public double health = 100;
	
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
		System.out.println("I am a Snake Lord!");
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

	@Override
	public void defend(double damage) {
		this.health -=damage;
	}


} // End SnakeLord
