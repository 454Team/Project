package character;

/*
 * @author Kevin Borling
 * CSCD 454 | Design Patterns
 */
public class Paladin implements Character {

	private double strength;
	private double agility;
	private double intelligence;
	private double vitality;
	private double luck;
	private double dexterity;
	
	public Paladin() {
		this.setStrength(80.0);
		this.setAgility(90.0);
		this.setIntelligence(0);
		this.setVitality(80.0);
		this.setLuck(30.0);
		this.setDexterity(40.0);
	} // End DVC
	
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return false;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}

	public double getAgility() {
		return agility;
	}

	public void setAgility(double agility) {
		this.agility = agility;
	}

	public double getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(double intelligence) {
		this.intelligence = intelligence;
	}

	public double getVitality() {
		return vitality;
	}

	public void setVitality(double vitality) {
		this.vitality = vitality;
	}

	public double getDexterity() {
		return dexterity;
	}

	public void setDexterity(double dexterity) {
		this.dexterity = dexterity;
	}

	public double getLuck() {
		return luck;
	}

	public void setLuck(double luck) {
		this.luck = luck;
	}
} // End Paladin
