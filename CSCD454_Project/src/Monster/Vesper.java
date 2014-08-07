package Monster;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public class Vesper implements Monster {

	public double strength = 100.00;
	public double agility = 50.00;
	public double vitality = 30.00;
	public double intelligence = 70.00;
	public double dexterity = 160.00;
	public double luck = 150.00;
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
		if(this.health <=0)
			return true;
		return false;
	}

	@Override
	public void test() {
		System.out.println("I am a Vesper!");
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
		if(this.health < 0)
			this.health = 0;
	}


}
