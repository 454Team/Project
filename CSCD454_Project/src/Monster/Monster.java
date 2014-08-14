package Monster;

import character.SkillsMain;

/*
 * @author Anatoliy Kozlov
 * CSCD 454 | Design Patterns
 */
public abstract class Monster {
	
	private double strength;
	private double agility;
	private double intelligence;
	private double vitality;
	private double luck;
	private double dexterity;
	private boolean isDefendingNow;
	private String desc;
	public double health;
	private SkillsMain skill1;
	private SkillsMain skill2;

	public Monster() {
		/* Set Skills */
		/* Set Attributes */
		this.setAgility(50.0);
		this.setDexterity(50.0);
		this.setIntelligence(50.0);
		this.setLuck(50.0);
		this.setStrength(50.0);
		this.setVitality(50.0);
		this.isDefendingNow = false;
	} // End DVC
	
	public Monster(SkillsMain skill1, SkillsMain skill2, double agility, double dexterity, double intelligence, double luck, double strength, double vitality, String desc) {
		this.setSkill1(skill1);
		this.setSkill2(skill2);
		/* Set Attributes */
		this.setAgility(agility);
		this.setDexterity(dexterity);
		this.setIntelligence(intelligence);
		this.setLuck(luck);
		this.setStrength(strength);
		this.setVitality(vitality);
		this.isDefendingNow = false;
		this.desc = desc;
		this.setHealth(vitality);
	} // End EVC

	public SkillsMain getSkill1() {
		return skill1;
	}

	public void setSkill1(SkillsMain skill12) {
		this.skill1 = skill12;
	}

	public SkillsMain getSkill2() {
		return skill2;
	}

	public void setSkill2(SkillsMain skill22) {
		this.skill2 = skill22;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		if(health < 0)
			this.health = 0;
		else
			this.health = health;
	}
	
	public void setStrength(double strength) {
		this.strength = strength;
	}

	public void setAgility(double agility) {
		this.agility = agility;
	}

	public void setIntelligence(double intelligence) {
		this.intelligence = intelligence;
	}

	public void setVitality(double vitality) {
		this.vitality = vitality;
	}

	public void setLuck(double luck) {
		this.luck = luck;
	}

	public void setDexterity(double dexterity) {
		this.dexterity = dexterity;
	}

	public void fight() {
		// TODO Auto-generated method stub
		
	}

	public void specialAttack() {
		skill1.attack(this.getAgility(), this.getLuck());	
	}

	public void defend() {
		// TODO Auto-generated method stub
		
	}
	
	public void defend(double damage) {
		this.health -=damage;
	}

	public boolean isAlive() {
		return this.health <=0 ;
	}


	public void specialAttack2() {
		skill2.attack(this.getAgility(), this.getLuck());
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
	
	public String toString() {
		return this.getDesc() + " with " + this.getHealth() + "hp" + " and " + this.getStrength() + "dmg";
	}
} // End Character
